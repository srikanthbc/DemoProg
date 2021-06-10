package SampleProg;

public class FindingMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,5,6,8};
		int len = num.length;
		System.out.println(len);
		System.out.println(missingNum(num,len+1));
		

	}
	
	static int missingNum(int[] num ,int n) {
		int sum = 0;
		int total = (n * (n+1))/2;
		
		for(int i = 0; i<num.length; i++) {
			
			sum = sum + num[i];
		}
		
		return (total - sum);
		
		
		
		
	}

}
