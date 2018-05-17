package ch04;

public class Q222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("11");
//		return 0;
	}

}


class Vehicle{
	String type="4W";
	int maxSpeed=100;
	Vehicle(){
		
	}
	Vehicle(String type,int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	}

}

class Car extends Vehicle{
	String trans;
	Car(String trans){
		this.trans=trans;
	}
	
}