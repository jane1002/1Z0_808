package ch00;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q5 extends Mid {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mid test1=new Test();
		Test test=new Test();
		
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2014,6,20);
		LocalDate date3=LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println(test.n3);
	}

}

class Mid{

	public static int findMid(int n1,int n2){
		return (n1+n2)/2;
	}
	
}

class Test extends Mid{
	int n1=22,n2=2;
	
	int n3=super.findMid(n1,n2);
}