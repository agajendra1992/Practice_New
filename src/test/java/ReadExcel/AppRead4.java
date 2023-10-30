package ReadExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead4 {

	public static void main(String[] args) throws FilloException {
		String path = System.getProperty("user.dir") + "\\UserData.xlsx";
		List<String> columnNameList = new ArrayList<String>();
		Map<String, List<String>> recordDataMapList = new HashMap<String, List<String>>();
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(path);
		String query = "select * from test";
		Recordset recordSet = connection.executeQuery(query);
		while (recordSet.next()) {
			columnNameList = recordSet.getFieldNames();
			int size = columnNameList.size();
			for (int i = 0; i <= (size - 1); i++) {
				String colname = columnNameList.get(i);
				String colval = recordSet.getField(colname);
				recordDataMapList.computeIfAbsent(colname, k -> new ArrayList<>()).add(colval);
			}
		}
		System.out.println(recordDataMapList);
		recordSet.close();
		connection.close();
	}

}
