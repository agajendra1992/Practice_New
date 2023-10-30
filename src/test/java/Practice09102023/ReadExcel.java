package Practice09102023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadExcel {
	
	public static Fillo fillo =  new Fillo();
	public static Connection connection;
	public static Recordset recordSet;
	public static ArrayList<String> columnNameList = new ArrayList<String>();
	public static HashMap<String, List<String>> mapValue = new HashMap<String, List<String>>();
	public static String path = System.getProperty("user.dir")+"\\UserData.xlsx";
	public static String query = "select * from test";
	
	
	public static HashMap<String, List<String>> getData(String path, String query) throws FilloException {
		connection = fillo.getConnection(path);
	    recordSet = connection.executeQuery(query);
	    columnNameList = recordSet.getFieldNames();
	    while(recordSet.next()) {
	    	for(int i = 0; i<columnNameList.size(); i++) {
	    		String columnName = columnNameList.get(i);
	    		String rowValue = recordSet.getField(columnName);
	    		mapValue.computeIfAbsent(columnName, e ->new ArrayList<>()).add(rowValue);
	    	}
	    }
		
		return mapValue;
	}
	

	public static void main(String[] args) {
	try {
		System.out.print(getData(path, query));
	} catch (FilloException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
