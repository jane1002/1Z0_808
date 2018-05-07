package ch01;
/*
 * 二维数组  length的用法
 * 
 */
public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] chs=new String[2][];
		chs[0]=new String[2];
		chs[1]=new String[5];
//		chs[2]=new String[5];
		
//		chs[1][2]="101";		
		int i=97;
		
		for (int a=0;a<chs.length;a++){
			for (int b=0;b<chs[a].length;b++){
				chs[a][b]=""+i;
				i++;
			}
		}
		
		for (String[] ca:chs){
			for (String c:ca){
				System.out.println(c+" ");
			}
			System.out.println();
		}
		
		System.out.println(chs.length);
		System.out.println(chs[0].length);
		System.out.println(chs[1].length);	
	}

}
