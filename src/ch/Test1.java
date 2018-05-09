package ch;
import java.util.*;
/*
 * 简单笔试题
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
//		int[][] shuzu={{1,1,1,2},{1,9,1,2},{1,8,9,2},{1,2,3,4}};
		int[][] shuzu=new int[l][l];
		
		for(int k=0;k<l;k++){
			int tmp=sc.nextInt();
			for (int m=0;m<l;m++){
				shuzu[k][l-1-m]=tmp%10;
				tmp=tmp/10;
			}
		}
		
		
		int x=10;
		for(int i=0;i<l;i++){
			for (int j=0;j<l;j++){
				
				if(i!=0 && i!=l-1 && j!=0 && j!=l-1){
					if (shuzu[i][j]>shuzu[i-1][j] &&
						shuzu[i][j]>shuzu[i+1][j] &&
						shuzu[i][j]>shuzu[i][j-1] &&
						shuzu[i][j]>shuzu[i][j+1]){
						shuzu[i][j]='X';
						System.out.printf("%c",shuzu[i][j]);
					}else{
						System.out.print(shuzu[i][j]);
						}
				}else{
					System.out.print(shuzu[i][j]);
				}

				
			}
			System.out.print("\n");
		}
		
		
		Test2 t2=new Test2();
		t2.aodian(4);
		
		
		
		
	}

}


class Test2{
	public void setShuzu(){
		
	}
	public void aodian(int n){
		
		
		


		
		
	}
	
	
}