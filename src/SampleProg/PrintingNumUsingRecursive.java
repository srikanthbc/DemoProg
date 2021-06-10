package SampleProg;

public class PrintingNumUsingRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		printRec(num);
		
		

	}
	
	static void printRec(int num) {
		
		if(num>0) {
			printRec(num-1);
		}
		System.out.println(num);
	}

}
