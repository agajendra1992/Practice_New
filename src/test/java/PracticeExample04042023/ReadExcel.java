package PracticeExample04042023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;import org.apache.poi.hpsf.Array;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadExcel {
	
	public static String ExcelPath = System.getProperty("user.dir")+ "\\UserData.xlsx";
	public static String sheet = "select * from test";
	public static String sheetUpdate = "Update test Set ";
	public static Fillo fillo = new Fillo();
	public static Connection connection;
	public static Recordset recordset;
	public  static List<String> columNameList = null;
	public  HashMap<String, List<String>> rowValueMap = new HashMap<String, List<String>>();
	
	
	public void setupConnection(String path, String query, String type) throws FilloException {
		connection = fillo.getConnection(path);
		if (type.equals("execute")) {
			recordset = connection.executeQuery(query);

		} else if (type.equals("update")) {
			connection.executeUpdate(query);
		}

	}
	public HashMap<String, List<String>> getAllRowData(String path, String query) throws FilloException{
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		setupConnection(path, query, "execute");
		columNameList=recordset.getFieldNames();
		while(recordset.next()) {
			for(int i = 0; i<columNameList.size(); i++) {
				String columnName = columNameList.get(i);
				String rowValue = recordset.getField(columnName);
				map.computeIfAbsent(columnName, k -> new ArrayList<>()).add(rowValue);
			}
		}
		return map;
	}

	public HashMap<String, List<String>> getRowData(String path, String query, String columnName)
			throws FilloException {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		setupConnection(path, query, "execute");
		columNameList = recordset.getFieldNames();
		while (recordset.next()) {
			String rowValue = recordset.getField(columnName);
			map.computeIfAbsent(columnName, k -> new ArrayList<>()).add(rowValue);

		}
		return map;
	}
	
	public HashMap<String, List<String>> updateColumnValue(String path, String result, String columnName,
			String columnToBeUpdated, String id) throws FilloException {
		HashMap<String, List<String>> mapUpated = new HashMap<String, List<String>>();
		String updatedQuery = sheetUpdate + columnName + " = " + "'" + result + "'" + " where " + columnToBeUpdated
				+ " = " + id;
		setupConnection(path, updatedQuery, "update");

		mapUpated.putAll(getAllRowData(path, ReadExcel.sheet));
		return mapUpated;
	}

	public static void main(String[] args) throws FilloException {
		ReadExcel readExcel = new ReadExcel();
		System.out.println(readExcel.getAllRowData(ExcelPath, sheet));
		System.out.println(readExcel.getRowData(ExcelPath, sheet, "Phone"));
		System.out.println(readExcel.updateColumnValue(ExcelPath, "FAIL", "Result", "TestCase_ID", "1"));
	}
	
	

}
