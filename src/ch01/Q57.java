package ch01;

public class Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting obj1=new Painting();
		Painting obj2=new Painting();
		obj1.setType(null);
		obj2.setType("Fresco");
		System.out.println(obj1.getType()+":"+obj2.getType());
		String str1=null;
		System.out.println(str1);
	}

}

class Painting{
	private String type;
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
}
