package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead14 {

	public static Fillo fillo = new Fillo();
	public static Connection connection = null;
	public static Recordset recordSet;
	public static String path = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";
	public static List<String> columnNameList = new ArrayList<String>();
	public static HashMap<String, List<String>> dataValueMap = new HashMap<String, List<String>>();

	public HashMap<String, List<String>> getData() throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		columnNameList = recordSet.getFieldNames();
		while (recordSet.next()) {
			for (int i = 0; i < columnNameList.size(); i++) {
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

	}

	public static void main(String[] args) throws FilloException {
		AppRead14 app = new AppRead14();
		System.out.println(app.getData());
		app.closeConnection();

	}

}
