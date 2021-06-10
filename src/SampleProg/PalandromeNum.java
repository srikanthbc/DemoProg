package SampleProg;

public class PalandromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPalandrome(151);

	}
	
	public static void isPalandrome(int num) {
		
		int sum =0 ;
		int temp;
		int rem;
		temp = num;
		while(num>0) {
			 rem = num % 10;
			 sum = (sum * 10) + rem;
			 num = num/10;
		}
		
		System.out.println(sum);
	}

}
