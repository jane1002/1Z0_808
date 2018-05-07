package ch00;

public class Q19 {

	int id;
	String name;
	public Q19(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q19 p1=new Q19(101,"pen");
		Q19 p2=new Q19(101,"pen");
		Q19 p3=p1;
		boolean ans1=p1.equals(p2);
		boolean ans2=p1.name.equals(p2.name);
		System.out.println(ans1+":"+ans2);
	}

}
