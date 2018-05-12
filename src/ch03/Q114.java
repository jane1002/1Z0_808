package ch03;
import java.util.*;
public class Q114 {
	public static List data=new ArrayList();
	static List update(String[] strs){
		for(String x:strs){
			data.add(x);
		}
		return data;
	}
	
	public static void main(String[] args){
		String[] d={"a","b","c"};
		update(d);
		for(String s:d){
			System.out.println(s+" ");
		}
	}
}


class TestThis{
	int x;
	int y;
	public void doStuff(int x,int y){
		this.x=x;
		this.y=y;
	}
}