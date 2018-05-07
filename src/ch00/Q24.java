package ch00;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=++x + x++ + x++;
		System.out.println(y);
	}

}


class Shape{
	public Shape(){
		System.out.println("Shape:constructor");
	}
	public void foo(){
		System.out.println("Shape:foo");
	}
	
}

class Square extends Shape{
	public Square(){
		super();
	}
	public Square(String label){
		System.out.println("Square:constructor");
	}
	public void foo(){
		super.foo();
	}
	public void foo(String label){
		System.out.println("Square:foo");
	}
}