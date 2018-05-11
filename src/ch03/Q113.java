package ch03;
import java.util.*;

public class Q113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myList=new ArrayList();
		String[] myArray;
		try{
			while(true){
				myList.add("My String");
			}
		}catch(RuntimeException re){
			System.out.println("Caught a RuntimeException");
		}catch(Exception e){
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}

}
