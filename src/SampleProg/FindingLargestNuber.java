package SampleProg;

public class FindingLargestNuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,32,45,53,54,100};
		
		int firstLargest = arr[0];
		int secondLargest = arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else {
				secondLargest = arr[i];
				
			}
		}
		
		
		
		System.out.println("First largest Number "+firstLargest);
		System.out.println("Second largest Number "+secondLargest);
		

	}

}
