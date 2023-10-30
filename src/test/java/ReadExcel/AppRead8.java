package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead8 {

	public Fillo fillo = new Fillo();
	public Connection connection = null;
	public Recordset recordSet;
	public static String excelpath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String query = "select * from test";
	public List<String> columnNameList = new ArrayList<String>();
	public HashMap<String, List<String>> valueMap = new HashMap<String, List<String>>();

	public HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		while (recordSet.next()) {
			columnNameList = recordSet.getFieldNames();
			for (int i = 0; i <= (columnNameList.size()) - 1; i++) {
				String columnNames = columnNameList.get(i);
				String rowValue = recordSet.getField(columnNames);
				valueMap.computeIfAbsent(columnNames, k -> new ArrayList<>()).add(rowValue);
			}
		}
		return valueMap;
	}

	public void tearDownConnecttion() {
		recordSet.close();
		connection.close();
		System.out.println("Connection Close Successfully");

	}

	public static void main(String[] args) throws FilloException {
		AppRead8 appRead = new AppRead8();
		System.out.println(appRead.getData(excelpath, query));
		appRead.tearDownConnecttion();
	}

}
