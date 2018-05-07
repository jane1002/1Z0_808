package ch01;

public class Q51 {
	public static void main(String[] args){
		A a1=new A();
		A a2=new B();
		A a3=new C();
		A a4=new B();
		
		A a5=new A();
//		B b1=(B)a5;
		
		a1.test();
		a2.test();
		a3.test();
		
//		a3=a2;
//		A a4=(A)a2;
		
//		a2=(B)a2;
		
		
//		a4.test();
//		a3.test();
//		a4.aa();
		
		a2=(A)a2;
		
		System.out.println(a2.i);	
		System.out.println(a2.getClass());
	}
}



class A{
	int i=1;
	public void test(){
		System.out.println("A");
	}
}


class B extends A{
	int i=2;
	public void test(){
		System.out.println("B");
	}
	public void aa(){
		System.out.println("aa");
	}
}

class C extends B{
	int i=3;
	public void test(){
		System.out.println("C");
	}
	public void CC(){
		
	}
}