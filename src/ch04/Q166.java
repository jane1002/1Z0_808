package ch04;

public class Q166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q166 ts=new Q166();
		System.out.println(isAvailable+" ");
		
		isAvailable=ts.doStuff();
		System.out.println(isAvailable);
	}
	
	public static boolean doStuff(){
		return !isAvailable;
	}
	static boolean isAvailable=false;

}
