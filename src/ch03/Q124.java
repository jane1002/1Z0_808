package ch03;
/*
 * 数组内内容都非引用
 */
public class Q124 {
	public static void main(String[] args){
		int[] intArr={15,30,45,60,75};
		intArr[2]=intArr[4];
		intArr[4]=90;
		for(int a:intArr){
			System.out.print(a+" ");
		}
		
		
		System.out.print("\n");
		char[] charArr={'a','b','c','d','e'};
		charArr[2]=charArr[4];
		charArr[4]='f';
		for(char a:charArr){
			System.out.print(a+" ");
		}
		
		
		System.out.print("\n");
		String[] strArr={"16","30","46","61","76"};
		strArr[2]=strArr[4];
		strArr[4]="91";
		for(String a:strArr){
			System.out.print(a+" ");
		}
	}
}
