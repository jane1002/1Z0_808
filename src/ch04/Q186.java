package ch04;

public class Q186 {

	public static void doChange(int[] arr){
		for(int pos=0;pos<arr.length;pos++){
			arr[pos]=arr[pos]+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30};
		doChange(arr);
		for(int x:arr){
			System.out.println(x+" ");
		}
//		doChange(arr[0],arr[1],arr[2]);
		
	}

}
