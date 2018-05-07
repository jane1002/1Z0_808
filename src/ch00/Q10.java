package ch00;

public class Q10 {
	double radius;
	public double area;
	
	public Q10(double r){
		radius=r;
		}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		radius=r;
	}
	public void getArea(){
//		return /* ??? */;
	}
	
}

class App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q10 c1=new Q10(17.4);
		c1.area=Math.PI *c1.getRadius()*c1.getRadius();
	}

}

