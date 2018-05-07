package ch00;

public class Q1 {
	static int count = 0;
	int i = 0;
	public void changeCount(){
		while(i<5){
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 check1=new Q1();
		Q1 check2=new Q1();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count+":"+check2.count);
	}

}
