package ExamPratice;

public class Desc5 {

	public static void main(String[] args) {
		int [] arr = {4435353,6776,373739902,1233};
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tem = 0;
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		System.out.print(arr[i]+ ",");
		}

	}

}
