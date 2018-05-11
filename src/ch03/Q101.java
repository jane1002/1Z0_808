package ch03;
//import java.io.*;

public class Q101 {
		public static void main(String[] args) {
			String str1 =new String("123456789");
			str1.substring(0,3);
			System.out.println(str1);
			
			
			StringBuilder str2=new StringBuilder("123456789");
			str2.substring(0,3);
			str2.append("XX");			
			System.out.println(str2);
			
			
			
		}
}

