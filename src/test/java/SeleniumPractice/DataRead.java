package SeleniumPractice;

import java.util.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

import PracticeExample04042023.ReadExcel;

public class DataRead extends ReadExcel {

	@Test(priority = 2, dataProvider = "test1")
	public void setData(Object n) throws FilloException {
		
	System.out.print(n+ " ");
	}
	
	@Test(priority = 1,dataProvider = "testData")
	public void setMultipleData(Object n) throws FilloException {
		
	System.out.print(n+ " ");
	}
	
	@Test(priority = 3,dataProvider = "test2")
	public void setData1(String n) throws FilloException {
		
	System.out.print(n+ " ");
	}

	@Test(priority = 4,dataProvider = "test3")
	public void setData2(String n, String n2, String n3,String n4, String n5) throws FilloException {
		
	System.out.print(n+ " "+ n2);
	}
	@DataProvider(name = "testData")
	public Iterator<Object[]> getData() throws FilloException {
		HashMap<String, List<String>> data = getAllRowData(ExcelPath, sheet);
		List<Object[]> listValue = new ArrayList<Object[]>();
		Collection<List<String>> s = data.values();
		List<String> sd = s.iterator().next();
		for(int i = 0; i<sd.size(); i++) {
			listValue.add(new Object[] { sd.get(i) });		
		}
	
		return listValue.iterator();

	}
	@DataProvider(name = "test1")
	public Iterator<Object> getData1() throws FilloException{
		HashMap<String, List<String>> data = getAllRowData(ExcelPath, sheet);
		List<Object> s = new ArrayList<Object>();
		s.add(data.get("Phone").size());
		return s.iterator();
	}
	
	@DataProvider(name ="test2")
	public Object[] getData2() throws FilloException {
		HashMap<String, List<String>> data = getAllRowData(ExcelPath, sheet);
		Object [] data1 = {data.values().toString()};
		return data1;
	}

	@DataProvider(name = "test3")
	public Object[][] getData3() throws FilloException {
		HashMap<String, List<String>> data = getAllRowData(ExcelPath, sheet);
		Object[][] dta1 = null;
		Object[] keys = data.keySet().toArray();
		Object[] values = data.values().toArray();
		dta1 = new String[keys.length][values.length];
		for (int i = 0; i < keys.length; i++) {
			dta1[0][i] = keys[i].toString();
			dta1[1][i] = values[i].toString();
		}

		return dta1;
	}
	

}