package ch01;

public class Q50 {
	public static String doMsg(char x){
		return "char";
	}
	public static String doMsg(int y){
		return "int";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x=8;
		int z='8';
		System.out.println(doMsg(x));
		System.out.println(doMsg(z));
		System.out.println("x="+x);
		System.out.println("z="+z);
		
	}

}

