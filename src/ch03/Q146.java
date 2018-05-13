package ch03;
import java.util.*;

public class Q146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if(names.remove("Aran")){
			names.remove("Jon");
			System.out.println("Remove!");
		}
		System.out.println(names);
		
	}

}
