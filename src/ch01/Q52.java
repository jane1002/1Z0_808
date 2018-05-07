package ch01;
/*
 * null在String打印的时候是输出的
 * char的时候打印为空格
 */
public class Q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names=new String[3];
		names[0]="Hello World";
		names[1]=null;
		names[2]=null;
		System.out.println(names[0].substring(0, 7));
		System.out.println(names[1]);
		System.out.println(names[2]);
		
	}

}
