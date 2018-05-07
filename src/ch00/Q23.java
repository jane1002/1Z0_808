package ch00;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String[] arr=new String[4];
			arr[1]="Unix";
			arr[2]="Linix";
			arr[3]="Solarios";
			for(String var:arr){
				System.out.println(var+" ");
			}
		}catch(Exception e){
			System.out.println(e.getClass());
		}
	}

}
