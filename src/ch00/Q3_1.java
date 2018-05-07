package ch00;

public class Q3_1 {
	int a = 10;
	int b = 20;
	public void setAge(int age){
		System.out.println(b);
	}
	public void setA(){
		System.out.println(a);
	}
	
	
	public Q3_1(int b){
		this();
		System.out.println(a);
		setAge(b);
		
	}
	
	public Q3_1(){
		int a=100;
//		public  void setAge(int age){
//			System.out.println(b);
//		}

		
	}
	
	
	
	public static void main(String[] args) {
		Q3_1 a=new Q3_1(3);
		a.setA();
	}
}

