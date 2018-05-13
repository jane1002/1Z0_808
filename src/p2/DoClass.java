package p2;
import p1.DoInterface;
public class DoClass implements DoInterface{
	int x1,x2;
	DoClass(){
		this.x1=0;
		this.x2=10;
	}
	@Override
	public void m1(int p1) {
		// TODO Auto-generated method stub
		x1+=p1;
		System.out.println(x1);
	}
	@Override
	public void m2(int p1) {
		// TODO Auto-generated method stub
		x2+=p1;
		System.out.println(x2);
	}
	
}
