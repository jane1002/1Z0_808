package ch00;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class CD{
	int r;
	CD(int r){
		this.r=r;
	}
}


class DVD extends CD{
	int c;
	DVD(int r,int c){
		super(r);
		this.c=c;
	}
}