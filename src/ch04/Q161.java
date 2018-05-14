package ch04;

public class Q161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Short s1=200;
		Integer s2=400;
		Long s3=(long)s1+s2;
		long s5=s3*s2;
		
		String s4=String.valueOf(s3*s2);
		Long.valueOf(s4);
		System.out.println(s4);
		
		
	}

	int sum(int first,int second){
		return first+second;
	}
}
