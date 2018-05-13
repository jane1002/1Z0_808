package ch03;

public class Q122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller c=new Caller();
		c.start();
//		c.init();
	}

}

class Caller{
	private void init(){
		System.out.println("Initialized");
	}
	
	public void start(){
		init();
		System.out.println("Started");
	}
}