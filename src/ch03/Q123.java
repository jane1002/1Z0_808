package ch03;
import java.util.*;
public class Q123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(21);
		list.add(15);
		list.add(30);
		list.add(11);
		list.add(2);
		list.removeIf(e->e%2==0);
		System.out.println(list);
	}

}
