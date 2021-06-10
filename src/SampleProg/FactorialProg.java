package SampleProg;

public class FactorialProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factNum = 5;
		
		System.out.println(fact(factNum));

	}

	private static int fact(int factNum) {
		
		int fact = 1;
		while(factNum>0) {
			fact =fact*factNum;
			factNum--;
		}
		return fact;
	}

}
