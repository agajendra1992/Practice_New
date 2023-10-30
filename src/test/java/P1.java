import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(4);
		intList.add(5);
		intList.add(1);

		for(int i = 0; i<intList.size(); i++) {
			for(int j = i+1; j<intList.size(); j++) {
				if(intList.get(i)== intList.get(j)) {
					intList.remove(i);
				}
			}
		}
System.out.println(intList);
	}

}
