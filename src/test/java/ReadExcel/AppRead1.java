package ReadExcel;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead1 {

	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("C:\\Users\\user\\Desktop\\UserData.xlsx");
		String fileData = "select * from test";
		Recordset recordset = connection.executeQuery(fileData);
		while(recordset.next()) {
			System.out.println(recordset.getField(recordset.getFieldNames().get(0)));
		}

	}

}
