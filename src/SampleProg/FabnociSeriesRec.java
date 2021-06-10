package SampleProg;

public class FabnociSeriesRec {
	static int n1 = 0;
	static int n2 = 1;
	static int sum;
	public static void main(String[] args) {
		
		
		int count = 10;
		System.out.print(n1 +""+n2);
		fabRec(count-2);
		
		

	}
	
	public static void fabRec(int count) {
		
		if(count>0) {
			sum = n1 + n2;
			System.out.print(sum);
			n1 = n2;
			n2 = sum;
			fabRec(count-1);
			
		}
		
	}

}
