package ch03;

public class Q120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java";
		char str2[]={'J','a','v','a'};
		String str3=null;
		for(char c:str2){
			str3=str3+c;
		}if (str1.equals(str3))
			System.out.println("Susscess");
		else
			System.out.println("Fail");
		
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
