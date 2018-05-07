package ch00;

public class Q11 {
	public static void main(String[] args){
		int row=10;
		for (;row>0;){
			int col=row;
			while(col>=0){
				System.out.println(col+" ");
				col-=2;
			}
			row=row/col;
		}
		System.out.println(":"+10/(-2));
	}
}
