package ch01;
import java.util.*;
public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Alpha> strs=new ArrayList<Alpha>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for (Alpha t:strs){
			System.out.println(t.doStuff("Java"));
		}
		
		

	}

}


class Alpha{
	public String doStuff(String msg){
		return msg;
	}
}

class Beta extends Alpha{
	public String doStuff(String msg){
		return msg.replace("a", "e");
	}
}

class Gamma extends Beta{
	public String doStuff(String msg){
		return msg.substring(2);
	}
}