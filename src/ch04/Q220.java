package ch04;


class Cake{
	int model;
	String flavor;
	Cake(){
		model=0;
		flavor="Unknown";
	}
}

public class Q220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[2];
		System.out.println(array[2]);
	}
	
	public static Cake bake1(Cake c){
		c.flavor="Strawberry";
		c.model=1200;
		return c;
	}


	public static void bake2(Cake c){
		c.flavor="Chocolate";
		c.model=1230;
		return;
	}
}

