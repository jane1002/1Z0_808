package ch;
/*
 * ch包为1z0-808example测试的题目
 * static方法只能被隐藏，不能被覆盖。
 * 
 */
public class Q3 extends Writer {
	public static void write(){
		System.out.println("Writing code");
	}
	
	void read(){
		System.out.println("Read");
	}

	public static void main(String[] args){
		Writer w=new Q3();
		w.write();
//		w.read();
//		Writer.write();
		System.out.println(w.getClass());
	}
}


abstract class Writer{
	public static void write(){
		System.out.println("Writing...");
	}
}

class Author extends Writer{
	public static void write(){
		System.out.println("Writing book");
	}
}

