package SampleProg;

public class Segrating0and1 {

	public static void main(String[] args) {

		int[] str = { 0, 1, 0, 1 ,0,0,1,1,1,1,1,1,0 ,0 };
		// char[] ch = str.toCharArray();
		segrigate(str);
		//print(str);
		
			System.out.println("After Segrating");
			int  length = str.length;
			for (int i = 0; i < length; i++) {
				System.out.print(str[i]);
			}

		
	}

	/*public static void segrigate(int[] ch) {

		System.out.println("Before Segrating");
		int  length = ch.length;
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (ch[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			ch[i] = 0;
		}
		for (int i = count; i < length; i++) {
			ch[i] = 1;

		}
		System.out.println(count);
	}
*/	
	
	
	static void segrigate(int[] ch) {
		
		int length =ch.length;
		int left = 0; int right = length-1;
		
		while(left < right) {
			
			while(ch[left] == 0 && left < right) 
				left ++;
			while(right == 1 && left<right) 
				right --;
			
			
			if(left<right) {
				ch[left] = 0;
				ch[right] = 1;
				left++;
				right--;
			
			}
			
		}
		
	}

	/*static void print(int[] ch) {
		System.out.println("After Segrating");
		int  length = ch.length;
		for (int i = 0; i < length; i++) {
			System.out.print(ch[i]);
		}

	}
*/
}
