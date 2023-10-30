package ReadExcel;

import java.util.ArrayList;
import java.util.HashSet;

import org.apache.commons.collections4.map.HashedMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead {

	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("C:\\Users\\user\\Desktop\\UserData.xlsx");
		String query = "Select * from test";
		Recordset recordSet = connection.executeQuery(query);
		
		HashSet<String> columSet = new HashSet<String>();
		HashedMap<String, String> employeeMap = new HashedMap<String, String>();
		System.out.println(recordSet.getFieldNames().get(0));
		System.out.println(recordSet.getCount());
		
		while (recordSet.next()) {
		//	System.out.println(recordSet.getField(recordSet.getFieldNames().get(0)));
		
			columSet.addAll(recordSet.getFieldNames());
		
		}

		System.out.println(columSet);
		recordSet.moveFirst();
		System.out.println("LastName::"+ recordSet.getField("LastName"));
		recordSet.moveLast();
		System.out.println("LastName::"+ recordSet.getField("LastName"));
		recordSet.movePrevious();
		System.out.println("LastName::"+ recordSet.getField("LastName"));
		recordSet.movePrevious();
		System.out.println("LastName::"+ recordSet.getField("LastName"));
		recordSet.close();
		connection.close();
	}

}
