package SampleProg;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isArmstrongNum(153);
		isArmstrongNum(0);
		isArmstrongNum(1);
		isArmstrongNum(343);

	}
	
	public static void isArmstrongNum(int num) {
		
		int temp;
		int rem;
		int sum = 0;
		temp = num;
		
		while(num>0) {
			
			rem = num %10;
			num = num /10;
			sum = sum + (rem * rem * rem); 
		}
		
		System.out.println(sum);
		if(temp == sum) {
			
			System.out.println("The entered Number " +temp+ " is Armstrong");
		}
		else {
			System.out.println("The entered Number " +temp+ " is Not Armstrong");
		}
		
	}

}
