package ch;
/*
 * 大的异常要放在后面，不然编译不通过
 */
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=2;
		try{
			for (int z=2;z>=0;z--){
				int ans=x/z;
				System.out.println(ans+" ");
			}
			
		}
		catch (ArithmeticException e1){
			System.out.println("E2");

		}
		catch (Exception e1){
			System.out.println("E1");
		}
		
		
	}

}
