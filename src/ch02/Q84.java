package ch02;

public class Q84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		int sum=0;
		try{
			for(int pos=0;pos<=4;pos++){
				sum=sum+arr[pos];
				if(pos==2){
					sum=sum/0;
				}
			}
		}catch(Exception e){
			System.out.println("Invalid index");
//			throw e;
		}
		System.out.println(sum);
	}

}
