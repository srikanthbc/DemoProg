package SampleProg;

public class SwapingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("Before Swaping S1 ::"+str1 +" And S2 ::"+str2);
		
		str1 = str1+str2;
		str2 = str1.substring(0,str1.length()- str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After Swaping S1 :: " +str1 + " And S2 :: "+str2);
		

	} 

}
