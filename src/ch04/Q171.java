package ch04;

public class Q171 {
	public static void Q171(){
		return;
		
	}
	public static void main(String[] args){
		Boolean[] bool=new Boolean[3];
		bool[0]=new Boolean(Boolean.parseBoolean("true"));
		bool[1]=new Boolean(null);
		
		bool[2]=new Boolean(Boolean.parseBoolean(" "));
		
		System.out.println(bool[0]+" "+bool[1]);
		
		System.out.println(bool[2]);
	}
}
