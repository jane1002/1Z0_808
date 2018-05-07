package ch01;
/*
 * 对象的=是把对象的名字指向被引用的对象
 * 
 */
public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]=new int [3];
		int nums2[]={1,2,3,4,5};
		nums1=nums2;
		
//		String str1="Hi";
//		String str2="Good";
//		System.out.println(str1.length());
//		str1=str2;
//		System.out.println(str1.length());
		for(int x:nums1){
			System.out.println(x);
		}
		System.out.println("\n");
		
		nums2[0]=20;							//这时候更改nums2，nums1指向nums2，nums1也改变了
		
		for(int x:nums1){
			System.out.println(x);
		}
	}

}
