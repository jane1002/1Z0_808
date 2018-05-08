package ch02;

public class Q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		
		System.out.println("5+2="+3+4+a);
		
		Test t1=new Test();
		t1.test1();
	}

}


class Test{
	public void test1(){
		for(int i=0;i<3;i++){
			if (i==2){
				System.out.println("1");
				break;
			
			}
			System.out.println("2");
		}
		System.out.println("3");
	}
}
	
