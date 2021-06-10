package SampleProg;

public class PrintingPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int i = 0; i < 20; i++) {
			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					flag = true;
					break;
				} else
					flag = false;
			}
			if (!flag) {

				System.out.print(i + " ");
			}

		}

	}

}
