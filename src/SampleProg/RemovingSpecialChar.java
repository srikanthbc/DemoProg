package SampleProg;

public class RemovingSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "#$%sert#$%";
		String str1 = "There are 11 Records";
		String num = "";
		for(int i=0; i<str1.length();i++) {
			
			if(str1.charAt(i) > 47 && str1.charAt(i) < 55) {
				num = num + str1.charAt(i);
			}
		}
		
		
		System.out.println(str.replaceAll("[^a-zA-z]", ""));
		System.out.println(str1.replaceAll("[^0-9]", ""));
		System.out.println(num);
	}

}
