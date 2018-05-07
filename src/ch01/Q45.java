package ch01;

public class Q45 {
	void readCard(int cardNo) throws Exception{
		System.out.println("Reading card");
	}
	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Checking Card");
	}
	
	public static void main(String[] args){
		Q45 ex=new Q45();
		int cardNo=12344;
		ex.checkCard(cardNo);
//		ex.readCard(cardNo);
		
		

		
	}
}
