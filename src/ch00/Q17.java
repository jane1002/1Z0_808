package ch00;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] iArray={{65,68},{69,70}};
		
		
		int[] iArray={65,68,69};
		iArray[2]=iArray[0];
		iArray[0]=iArray[1];
		iArray[1]=iArray[2];
		for(int element:iArray){
			System.out.println(element+" ");
		}
		
		
//		for(int[] element: iArray)for(int[] element: iArray[])
//		{
//			System.out.println(element+" ");
//		}
		
		
//		for(int[] element: iArray)for(int element: iArray[])
//		{
//			System.out.println(element+" ");
//		}
	}
	}

