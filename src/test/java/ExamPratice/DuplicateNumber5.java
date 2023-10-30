package ExamPratice;

public class DuplicateNumber5 {

	public static void main(String[] args) {
	int aa[]= {122,233,122,334,22};
	for(int i =0; i<aa.length; i++) {
		for(int j = i+1; j<aa.length; j++) {
			int temp =0;
			if(aa[i]== aa[j]) {
				System.out.println("Duplicate : "+aa[i]);
			}
			
		}
	}

	}

}
