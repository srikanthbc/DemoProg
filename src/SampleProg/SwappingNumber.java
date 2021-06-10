package SampleProg;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Before Swaping Num1 "+num1 +" and Num2 " +num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swaping Num1 "+num1 +" and Num2 " +num2);
		
		
		 

	}

}
