package me.shadu;

public class Problem1 {

	public static void main(String[] args) {
		int y= 0;
		for(int x=1 ; x<1000 ; x=x+1){
			if( (x % 3 == 0) ||(x % 5 == 0) ) {
				y = y+x;
			}
			System.out.println("y: "+y + " x: " + x);
		}
		
	}

}
