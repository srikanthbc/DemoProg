package SampleProg;

public class factRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factRecursive(5));

	}
	
	static int factRecursive(int num) {
		
		if(num == 0) {
			return 1;
		}else
			return num*factRecursive(num-1);
		
	}

}
