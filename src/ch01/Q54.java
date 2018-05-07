package ch01;
/*
 * 直接打印类会打印出包名.类名.地址
 */

public class Q54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet[] planets={
				new Planet("Mercury",0),
				new Planet("Venus",0),
				new Planet("Earth",1),
				new Planet("Mars",2)
		};
		
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
	}

}

class Planet{
	public String name;
	public int moons;
	
	public Planet(String name,int moons){
		this.name=name;
		this.moons=moons;
	}
}