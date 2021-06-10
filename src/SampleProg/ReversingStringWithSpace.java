package SampleProg;

public class ReversingStringWithSpace {

	public static void main(String[] args) {
		
		String str = "The hello world";
		String [] strArr = str.split(" ");
		String reverseString = "";
		for(int i = 0;i<strArr.length;i++) {
			reverseString = reverseString +" "+ revString(strArr[i]);
		}
		System.out.println(reverseString+" ");
		
	}
	
	public static String revString(String str) {
		
		int len = str.length();
		String rev = "";
		for(int i = len-1;i>=0;i--) {
			rev = rev + str.charAt(i);
			
		}
		return rev; 
	}

}
