package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead12 {
	public Fillo fillo = new Fillo();
	public Connection connection = null;
	public Recordset recordSet;
	public static String excelPath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";
	public static List<String> columnValueList = new ArrayList<String>();
	public static HashMap<String, List<String>> hashMapValue = new HashMap<String, List<String>>();

	public HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		columnValueList = recordSet.getFieldNames();
		while (recordSet.next()) {
			for (int i = 0; i < columnValueList.size() - 1; i++) {
				String columnName = columnValueList.get(i);
				String rowValue = recordSet.getField(columnName);
				hashMapValue.computeIfAbsent(columnName, k -> new ArrayList<>()).add(rowValue);
			}
		}
		return hashMapValue;
	}

	public void closeConnection() {
		recordSet.close();
		connection.close();
	}

	public static void main(String[] args) throws FilloException{
		AppRead12 appread = new AppRead12();
		System.out.println(appread.getData(excelPath, query));
		appread.closeConnection();

	}
}
