package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead16 {

	public static Fillo fillo = new Fillo();
	public static Connection connection = null;
	public static Recordset recordSet;
	public static ArrayList<String> columnNamelist = new ArrayList<String>();
	public static HashMap<String, List<String>> mapList = new HashMap<String, List<String>>();
	public static String path = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";

	public static HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		columnNamelist = recordSet.getFieldNames();
		while (recordSet.next()) {
			for (int i = 0; i < columnNamelist.size(); i++) {
				String columnName = columnNamelist.get(i);
				String rowValue = recordSet.getField(columnName);
				mapList.computeIfAbsent(columnName, e -> new ArrayList<>()).add(rowValue);
			}
		}
		return mapList;
	}

	public static void main(String[] args) {
		try {
		System.out.println(	getData(path, query));
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
