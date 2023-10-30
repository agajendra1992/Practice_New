package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead15 {

	public static Fillo fillo = new Fillo();
	public static Connection connection = null;
	public static Recordset recordset;
	public static ArrayList<String> columnsNameList = new ArrayList<String>();
	public static HashMap<String, List<String>> hashMapValue = new HashMap<String, List<String>>();
	public static String path = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";

	public static HashMap<String, List<String>> getData() throws FilloException {
		connection = fillo.getConnection(path);
		recordset = connection.executeQuery(query);
		columnsNameList = recordset.getFieldNames();
		while (recordset.next()) {
			for (int i = 0; i < columnsNameList.size(); i++) {
				String columnName = columnsNameList.get(i);
				String rowValue = recordset.getField(columnName);
				hashMapValue.computeIfAbsent(columnName, e -> new ArrayList<>()).add(rowValue);
			}
		}
		return hashMapValue;
	}

	public static void closeConnection() {
		recordset.close();
		connection.close();
	}

	public static void main(String[] args) throws FilloException {
		System.out.println(getData());
		closeConnection();
	}

}
