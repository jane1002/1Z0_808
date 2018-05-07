package ch00;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isChecked =false;
		int[] array={1,3,5,7,8,9};
		int index=array.length;
		int[] arr={1,2,3};
//		while(index>0){											//题目
//			if(array[index-1]%2==0){
//				isChecked=true;
//			}
//			index--;
//			
//		}
		
		final int j;											//final性质测试
		j=5;
//		j=3;
		
		for (int var:arr){										//for each循环每次循环的时候的测试
			System.out.println("first");
			int i=1;
			System.out.println("second");
			while(i<=var){
				System.out.println(i++);
				System.out.println("while loop");
			}
		}
		
//		System.out.println(array[index]+","+isChecked);
	}

}
