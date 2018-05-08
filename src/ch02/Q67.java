package ch02;

public class Q67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cm=new Customer();
		cm.useElectricity(1);
	}

}

class Customer{
	ElectricAccount acct=new ElectricAccount();
	
	public void useElectricity(double kWh){
		acct.a1();
	}
}

class ElectricAccount{
	private double kWh;
	private double rate=0.07;
	private double bill;
	
	public void a1(){
		this.addKWh(kWh);
	}
	
	private void addKWh(double kWh){
//		if(kWh>0){
//			this.kWh+=kWh;
//			this.bill=this.kWh*this.rate;

		System.out.println("addKWh");
		}
}
