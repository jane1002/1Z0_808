package ch02;
/*
 * this()和super()只能有一个在函数第一行。同时如果超类没有定义（即使是自带的空函数）
 * 子类引用会报错
 */
public class Q74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Vehicle{
	int x;
	Vehicle(){
		this(10);
	}
	Vehicle (int x){
		this.x=x;
	}
}

class Car extends Vehicle{
	int y;
	Car(){
		super();
//		this(20);
	}
	Car(int y){
		this.y=y;
	}
}