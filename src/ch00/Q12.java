package ch00;
import java.util.*;


public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ps=new ArrayList();
		Patient p2=new Patient("Mike");
//		Patient p3=new Patient("Jack");
//		Patient test=new Patient("Rose");
		

//		ps.add(p3);
		ps.add(p2);
//		ps.add(1,test);
//		ps.remove(0);
//		int f=ps.indexOf();
//		int f=ps.indexOf(p2);
//		System.out.println("f="+f);
		
		Patient p=new Patient("Mike");
		int f=ps.indexOf(p);
		if (f>=0){
			
			System.out.println("Mike Found");
		}

	}

}


class Patient{



	String name;
	public Patient(String name){
		this.name=name;
	}
}



