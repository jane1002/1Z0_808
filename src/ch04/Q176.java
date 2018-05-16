package ch04;

public class Q176 {
	String myStr="7007";
	
	public static void main(String[] args){
		Q176 obj=new Q176();
		obj.doSutff("9009");
	}
	
	public void doSutff(String str){
		int myNum=0;
		try{
			String myStr=str;
			myNum=Integer.parseInt(myStr);
			
		}catch(NumberFormatException ne){
			System.err.println("Error");
		}
		System.out.println("myStr:"+myStr+",nyNum:"+myNum);
	}
}
			 
