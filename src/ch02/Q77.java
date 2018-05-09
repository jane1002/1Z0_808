package ch02;

public class Q77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sun obj2=new Sun();
		obj2.aa();
		
		Star obj3=obj2;
		((Sun)obj3).doStuff();
		((Star)obj2).doStuff();
		((Universe)obj2).doStuff();
	}

}


class Star{
	public void doStuff(){
		System.out.println("Twinkling Star");
	}
}

interface Universe{
	public void doStuff();
}

class Sun extends Star implements Universe{
	public void doStuff(){
		System.out.println("Shining Sun");
	}
	
	public void aa(){
		
	}
}