package ch00;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ret = true;  
		String product = "Pen";
		product.toLowerCase();
		String c1="BOX";
		product.concat(c1);
		System.out.println(product);
		System.out.println(c1);
		System.out.println(product.concat(c1));
		try{
		System.out.println(product.concat("BOX".toLowerCase()));
		System.out.println(product.substring(1,4));
		System.out.println("异常之后的语句");
		}
		catch (Exception e){
			System.out.println("System out print:"+e);
			ret = false;  
            throw e;  
		}
//		catch (Exception e){
//			throw e;
//		}
//		
		finally {  
            System.out.println("testEx, finally; return value=" + ret);  
		}
	}

}
