package SampleProg;

public class CountObjectCreated {
	
	static int i=0;
	
	CountObjectCreated(){
		i++;
	}
	
	public void getCount() {
		System.out.println(i);
	}
	

}
