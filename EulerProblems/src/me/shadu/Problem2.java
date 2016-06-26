package me.shadu;

public class Problem2 {

	public static void main(String[] args) {
		int xn = 1;
		int xn1 = 2;
		int y = xn1;
		for(int xn2 =3 ; xn2 < 4000000; xn2 = xn+xn1) {
			
			
			xn=xn1;
			xn1=xn2;
			
			if(xn2%2 == 0){
				y = y + xn2;
			}
			
		}
		System.out.print("y= " +y);
	}
	
}
