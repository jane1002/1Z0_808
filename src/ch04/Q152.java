package ch04;

public class Q152 {
	private int x=0;
	private int y=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q152 accApp=new Q152();
		accApp.printTHis(1,2);
		accApp.printThat(3,4);
	}

	
	public void printTHis(int x,int y){
		x=x;
		y=y;
		System.out.println("x="+this.x+"y="+this.y);
	}
	
	public void printThat(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println("x="+this.x+"y="+this.y);
	}
}
