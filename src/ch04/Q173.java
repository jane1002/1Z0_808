package ch04;

public class Q173 extends Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q173 r=new Q173();
		System.out.println(r.getClass());
		System.out.println(r.method2());
	}

}


class Root{
	private static final int MAX=20000;
	private int method1(){
		int a=100+MAX;
		return a;
	}
	protected int method2(){
		int a=200+MAX;
		return a;
	}
}