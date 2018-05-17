package ch04;

public class Q215 implements Z{
	public String toString(){
		return "X";
	}

	static public void main(String[] args) {
		// TODO Auto-generated method stub
		Y myY=new Y();
		System.out.println("1");
//		X myX=myY;
//		Z myZ=myX;
	}

}

class Y extends Q215{
	public String toString(){
		return "Y";
	}
}	

interface Z{
	public String toString();
}