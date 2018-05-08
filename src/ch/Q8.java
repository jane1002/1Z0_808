package ch;
/*
 * StringBuilder的append无需使用s1=s1.append（） 便可存储，substring不然
 * 同时substring（4）为截掉4个，substring(0,4)为将四个截取出来
 */

public class Q8 {
	public static void main(String[] args){
		StringBuilder s1=new StringBuilder("Java");
		String s2="Love";
		System.out.println(s1);
		s1.append(s2);
		System.out.println(s1);
		String s4=s1.substring(0,4);
		System.out.println(s1);
		int foundAt=s1.indexOf(s2);
		System.out.println(foundAt);
		System.out.println("s4="+s4);
		
		
		String s3="I";
		s2=s2.concat(s3);
		System.out.println(s2);
	}
	

}
