package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead11 {
	public static String excelPath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String tableName = "select * from test";
	public static Connection connection = null;
	public static Fillo fillo = new Fillo();
	public static Recordset recordSet;
	public static HashMap<String, List<String>> map = new HashMap<String, List<String>>();
	public static List<String> colmnNameList = new ArrayList<>();

	public static HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		colmnNameList = recordSet.getFieldNames();
		while (recordSet.next()) {
			for (int i = 0; i < (colmnNameList.size()) - 1; i++) {
				String columnName = colmnNameList.get(i);
				String rowVal = recordSet.getField(columnName);
				map.computeIfAbsent(columnName, k -> new ArrayList<>()).add(rowVal);

			}
		}
		return map;
	}
	
	public static HashMap<String, List<String>> updateData(String id, String result, String columnName)
			throws FilloException {
		connection = fillo.getConnection(excelPath);
		String updatedData = "Update test Set Result = "+ result+ " where "+ columnName + " ="+ id;
		connection.executeUpdate(updatedData);
		map.clear();
		return map;
	}
	

	@Test
	public void printData() {
		try {
			System.out.println(getData(excelPath, tableName));
			System.out.println(updateData("1", "PASS", "TestCase_ID"));
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
