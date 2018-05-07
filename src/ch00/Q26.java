package ch00;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ta="A ";
		System.out.println(ta);
		ta=ta.concat("B ");
		System.out.println(ta);
		String tb="C ";
		System.out.println(ta);
		ta=ta.concat(tb);
		System.out.println(ta);
		ta.replace("C", "D");
		System.out.println(ta);
		ta=ta.concat(tb);
		System.out.println(ta);
		
		
		String t1="ABC";
		t1.replace("D", "A");
		System.out.println(t1);
		System.out.println(t1.replace("A", "D"));
			
	}

}

