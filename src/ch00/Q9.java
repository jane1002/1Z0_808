package ch00;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test=new Test2();
		test.count();
	}

}

class Test2{
	double discount=0;
	void count(){
		int qty = Integer.parseInt("85");

		if(qty>80&&qty<90){
			discount=0.2;
		}else{
			discount=0;
		}
		System.out.println(discount);
		if(qty>=90){
			discount=0.5;
		}else{
			discount=0;
		}
		
//		discount=(qty>=90)?0.5:0;
//		discount=(qty>80)?0.2:0;
		
		System.out.println(qty);
		System.out.println(discount);
	}
}