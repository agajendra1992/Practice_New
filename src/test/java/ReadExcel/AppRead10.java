package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead10 {

	public static String excelPath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";

	public static List<String> columnNameList;
	public static HashMap<String, List<String>> readDataMap = new HashMap<String, List<String>>();
	public static Fillo fillo = new Fillo();
	public static Connection connection;
	public static Recordset recordSet;

	public static HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		while (recordSet.next()) {
			columnNameList = recordSet.getFieldNames();
			for (int i = 0; i < columnNameList.size(); i++) {
				String columnValue = columnNameList.get(i);
				String rowValue = recordSet.getField(columnValue);
				readDataMap.computeIfAbsent(columnValue, k -> new ArrayList<>()).add(rowValue);
			}
		}
		return readDataMap;
	}

	public static HashMap<String, List<String>> updateData(String path, String status, String id) throws FilloException {
		columnNameList = recordSet.getFieldNames();
		String queryUpdate = "Update test Set " + columnNameList.get(4) + "=" + status + " where "
				+ columnNameList.get(0) + "="+id;
		connection.executeUpdate(queryUpdate);

		return readDataMap;
	}

	public static void closeConnection() {
		connection.close();
		recordSet.close();
	}

	public static void main(String[] args) throws FilloException {
		System.out.println(getData(excelPath, query));
		for(int i = 0; i<readDataMap.size(); i++) {
			if(1 ==i) {
			updateData(excelPath, "'PASS'", String.valueOf(i));
			}
			else {
				updateData(excelPath, "''", String.valueOf(i));
			}
		}

		closeConnection();
	}

}
