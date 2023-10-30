package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead5 {

	public final Fillo fillo = new Fillo();
	public Connection connection = null;
	public Recordset recordSet;
	public static String excelFileName = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String queryData = "select * from test";
	public List<String> columnNameList = new ArrayList<String>();
	public HashMap<String, List<String>> recordDataMapList = new HashMap<String, List<String>>();

	public HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		while (recordSet.next()) {
			columnNameList = recordSet.getFieldNames();
			for (int i = 0; i <= (columnNameList.size() - 1); i++) {
				String columnName = columnNameList.get(i);
				String rowValue = recordSet.getField(columnName);
				recordDataMapList.computeIfAbsent(columnName, k -> new ArrayList<>()).add(rowValue);
			}
		}
		return recordDataMapList;
	}

	public HashMap<String, List<String>> updateData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		String strUpdateQuerry = "Update test Set Result ='PASS' ";
		connection.executeUpdate(strUpdateQuerry);
		return recordDataMapList;
	}
	
	public void tearDownConnecttion() {
		recordSet.close();
		connection.close();
		System.out.println("Connection Close Successfully");
		
	}

	@Test
	public void testDataValidation() throws FilloException {
		System.out.println(updateData(excelFileName, queryData));
		System.out.println(getData(excelFileName, queryData));
		tearDownConnecttion();
	}
}
