package ch02;

public class Q61 {
	static String[][] arr=new String[3][];
	private static void doPrint(){
		for(String[] sub:arr){
			int j=sub.length-1;
//			for(String str:sub){
				System.out.println(sub[j]);
//			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] class1={"A","B","C"};
		String[] class2={"L","M","N","o"};
		String[] class3={"I","J"};
		arr[0]=class1;
		arr[1]=class2;
		arr[2]=class3;
		Q61.doPrint();
	}

}

