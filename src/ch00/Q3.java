package ch00;

public class Q3 {
	

	public static void main (String[] args){
		Person1 p1=new Person1("Jesse");
		Person1 p2=new Person1("Walter",52);
		System.out.println(p1.show());
		System.out.println(p2.show());
	}
	
}


class Person1 {
	String name;
	int age=25;
	public Person1(){
		Test();
	};							//无参构造
	private void Test() {
		// TODO Auto-generated method stub
		
	}
	public Person1 (String name){				//带string构造函数
		this();

		setName(name);
	}
	public Person1(String name,int age){			//带string age构造函数
//		Person(name);
		setAge(age);
	}
	
	
	public String show(){
		return name+" "+age+" ";
	}
	public void setName(String name){};
	public void setAge(int age){};
	

	}