package ReadExcel;

import java.util.HashMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead2 {

	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("C:\\Users\\user\\Desktop\\UserData.xlsx");
		String data = "select FirstName from test";
		Recordset recordSet = connection.executeQuery(data);
		HashMap<String, String> recordeData = new HashMap<String, String>();
		while (recordSet.next()) {
			int count = 0;
			recordeData.put(recordSet.getFieldNames().get(count++),
					recordSet.getField(recordSet.getFieldNames().get(count++)));
			count++;
		}
		int count = recordSet.getCount();
		for(int i =0; i<=count; i++)
		System.out.println(recordSet.getField(i).name());
	}

}
