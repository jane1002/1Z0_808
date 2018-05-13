package ch03;

public class Q134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int sum;
		
		Test t1=new Test();
		t1.t();
		t1.print();
//		do{
//			sum+=sum;
//		}while((num--)>1);
//		System.out.println(sum);
	}

}


class Test{
	int sum;
	void t(){
		this.sum+=this.sum;
	}
	void print(){
		System.out.println(this.sum);
	}
}