package ch03;

public class Q150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}


interface CanFly{
	String type = "A";
	void fly();
	default String getType(){
		int i=1;
		
		return type;
	};
}