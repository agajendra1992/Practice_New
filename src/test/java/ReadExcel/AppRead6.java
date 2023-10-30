package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead6 {

	public static String filePath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";
	public static Fillo fillo = new Fillo();
	public static Connection connection = null;
	public Recordset recordSet;
	public List<String> columnNameList = new ArrayList<String>();
	public HashMap<String, List<String>> recordDataMapList = new HashMap<String, List<String>>();

	public HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);

		while (recordSet.next()) {
			columnNameList = recordSet.getFieldNames();
			for (int i = 0; i < (columnNameList.size()) - 1; i++) {
				String colValue = columnNameList.get(i);
				String rowValue = recordSet.getField(colValue);
				recordDataMapList.computeIfAbsent(colValue, k -> new ArrayList<>()).add(rowValue);

			}
		}

		return recordDataMapList;
	}
	
	public static void updateData(String excelpath, String query) throws FilloException {
		connection = fillo.getConnection(excelpath);
		connection.executeUpdate(query);

	}

	@Test
	public void dataValue() throws FilloException {
		try {
			String querydata = "Update test Set Result = 'Fail' ";
			updateData(filePath, querydata);
			System.out.println(getData(filePath, query));
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
