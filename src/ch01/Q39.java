package ch01;

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldInit f = new FieldInit();
		f.printAll();
	}

}
class FieldInit {
	char c;
	boolean b;
	float f;
	double d;
	long l;
	String str;
	void printAll() {
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("l = " + l);
		System.out.println("str = " + str);
	}
}
