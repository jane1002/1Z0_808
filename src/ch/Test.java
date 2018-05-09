package ch;
/*
 * 简单笔试题
 */
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		Change t1=new Change();
		t1.change(l);
	}

}

class Change{
	public void change(int n){
		int hundred=0;
		int ten=0;
		int num=0;
		int tmp=0;
		
		num=n%10;
		tmp=n/10;
		ten=tmp/10;
		tmp/=10;
		if(n>99){
			hundred=tmp;
		
		for(int i=0;i<hundred;i++){
			System.out.print("B");
		}
		}
		
		for(int j=0;j<ten;j++){
			System.out.print("S");
		}
		for(int k=0;k<num;k++){
			System.out.print(k+1);
		}
		
	}
}