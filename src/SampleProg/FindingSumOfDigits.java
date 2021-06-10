package SampleProg;

public class FindingSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2341212;
		int sum = 0;
		
		while(num > 0) {
			
			sum = sum +num % 10;
			num = num / 10;
		}
		
		System.out.println(sum);

	}

}
