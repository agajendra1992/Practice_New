package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead9 {

	public Fillo fillo = new Fillo();
	public Connection connection = null;
	public Recordset recordSet;
	public static String excelPath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";
	public List<String> columnNameList = new ArrayList<String>();
	public HashMap<String, List<String>> dataValueMap = new HashMap<String, List<String>>();

	public HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		columnNameList = recordSet.getFieldNames();
		while (recordSet.next()) {
			for (int i = 0; i <= (columnNameList.size()) - 1; i++) {
				String columnName = columnNameList.get(i);
				String rowValue = recordSet.getField(columnName);
				dataValueMap.computeIfAbsent(columnName, k -> new ArrayList<>()).add(rowValue);
			}
		}
		return dataValueMap;
	}

	public void closeConnection() {
		recordSet.close();
		connection.close();
		System.out.println("Connection Close Successfully");
	}

	public static void main(String[] args) throws FilloException {
		AppRead9 appRead = new AppRead9();
		System.out.println(appRead.getData(excelPath, query));
		appRead.closeConnection();

	}

}
