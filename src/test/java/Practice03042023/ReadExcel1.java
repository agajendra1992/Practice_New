package Practice03042023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadExcel1 {

	public static Fillo fillo = new Fillo();
	public static Connection connection;
	public static Recordset recordSet;
	public static String excelPath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String sheet = "select * from test";
	public static String sheet1 = "Update test set ";
	public static List<String> columnNameList;
	public static HashMap<String, List<String>> readDataMap = new HashMap<String, List<String>>();
	public static HashMap<String, List<String>> updateDataMap = new HashMap<String, List<String>>();

	public static HashMap<String, List<String>> getDataValue(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		columnNameList = recordSet.getFieldNames();
		while (recordSet.next()) {
			for (int i = 0; i < (columnNameList.size()); i++) {
				String columnName = columnNameList.get(i);
				String rowValues = recordSet.getField(columnName);

				readDataMap.computeIfAbsent(columnName, k -> new ArrayList<>()).add(rowValues);
			}
		}
		return readDataMap;
	}

	public static HashMap<String, List<String>> updatResultValue(String path, String query, String colName,
			String result, String colName1, int id) throws FilloException {
		connection = fillo.getConnection(path);
		connection.executeUpdate(updateBuildQuery(colName, result, colName1, id));
		updateDataMap.putAll(getDataValue(path, query));
		return updateDataMap;
	}

	public static String updateBuildQuery(String columnName, String result, String columnName1, int id) {
		return sheet1 + columnName + "=" + "'" + result + "'" + "where " + columnName1 + " = '" + id + "'";
	}

	public static void closeConnection() {
		recordSet.close();
		connection.close();

	}

	public static void main(String[] args) throws FilloException {
		//System.out.println(getDataValue(excelPath, sheet));
		readDataMap.clear();
		System.out.println(updatResultValue(excelPath, sheet, "Result", "fail".toUpperCase(), "TestCase_ID", 1));
		closeConnection();
	}

}
