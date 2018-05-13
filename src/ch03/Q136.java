package ch03;

public class Q136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="JAVA";
		String[] str2={"J","a","v","a"};
		String str3="";
		
		for(String str:str2){
			str3=str3+str;
		}
		
		System.out.println(str3);
		System.out.println(str1.equals(str3));
		
	}

}
