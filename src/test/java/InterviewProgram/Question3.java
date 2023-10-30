package InterviewProgram;

public class Question3 {

	public void printValue(Integer i) {
		System.out.println("Integer");
	}

	public void printValue(int i) {
		System.out.println("int");
	}

	public void printValue(long i) {
		System.out.println("long");
	}

	public void printValue(short i) {
		System.out.println("short");
	}

	public void printValue(byte i) {
		System.out.println("byte");
	}

	public static void main(String[] args) {
		Question3 ques = new Question3();
		ques.printValue((byte)10);
	}

}
