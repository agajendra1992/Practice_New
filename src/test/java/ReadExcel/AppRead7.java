package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead7 {
	public static Fillo fillo = new Fillo();
	public static Connection connection;
	public static Recordset recordSet;
	public static String dataPath = System.getProperty("user.dir") + "\\UserData.xlsx";
	public static String dataQuery = "select * from test";
	public HashMap<String, List<String>> recordData = new HashMap<String, List<String>>();
	public static List<String> columnNameList = new ArrayList<String>();

	public HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
		recordSet = connection.executeQuery(query);
		columnNameList.addAll(recordSet.getFieldNames());
		while (recordSet.next()) {
			for (int i = 0; i < (columnNameList.size()) - 1; i++) {
				String colValue = columnNameList.get(i);
				String rowValue = recordSet.getField(colValue);
				recordData.computeIfAbsent(colValue, k -> new ArrayList<>()).add(rowValue);

			}

		}
		return recordData;
	}

	public HashMap<String, List<String>> updateData(String path, String query) throws FilloException {
		fillo.getConnection(path);
		for(int i=0; i<recordSet.getCount(); i++) {
		String queryUpdate = "update test Set Result = ''";
		connection.executeUpdate(queryUpdate);
		}
		return getData(path, query);
	}

	@Test
	public void Validate_Data() throws FilloException {
		System.out.println(getData(dataPath, dataQuery));
		System.out.println(updateData(dataPath, dataQuery));
	}
}
