package ch04;

public class Q178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet a=new Dog();
//		Pet b=new Pet();
//		Dog f=new Pet();
		Dog d=new Beagle();
		Pet e=new Beagle();
//		Beagle c=new Dog();
	}

}

interface Pet{
	
}

class Dog implements Pet{
	
}

class Beagle extends Dog{
	
}