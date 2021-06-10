package SampleProg;

public class StringReverseRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="javaprog";
		System.out.println(strrev(str));
		
		
				

	}
	
	static String strrev(String str) {
		int len = str.length();
		if(len == 0) {
			return str;
		}else 
			return strrev(str.substring(1)) + str.charAt(0);
		
	}

}
