package ReadExcel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.hpsf.Array;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class AppRead3 {

	public static void main(String[] args) throws FilloException {
		Fillo fillo = new Fillo();
		Connection connections = fillo.getConnection("C:\\Users\\user\\Desktop\\UserData.xlsx");
		String queryparam = "select FirstName from test";
		Recordset recSet = connections.executeQuery(queryparam);
		List<String> columnList = new ArrayList<String>();
		columnList.addAll(recSet.getFieldNames());
		HashedMap<String, String> map = new HashedMap<String, String>();
		System.out.println(columnList);
		for(int i =0; i<columnList.size(); i++) {
			//map.put(columnList.get(i), recSet.getField(columnList.get(i)));
			System.out.println(recSet.getField(columnList.get(i)));
			int in = recSet.getField(columnList.get(i)).length();
			System.out.println(in);
		}
	}

}
