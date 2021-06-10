package SampleProg;

public class UsageOfStatic {
	static int i =10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		
		System.out.println(i);
		

	}
	
	static {
		int j=0;
		i=20;
		
		System.out.println(i);
		System.out.println(j);
	}

}
