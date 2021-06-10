package SampleProg;

public class FabnociiUsingRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fabRecursive(9));

	}
	
	public static int fabRecursive(int n)
	{
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		
		return fabRecursive(n-1) + fabRecursive(n-2);
	}

}


