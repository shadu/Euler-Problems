package me.shadu;

import java.math.BigInteger;
import java.util.ArrayList;


public class problem3 {

	public static void main(String[] args) {
		BigInteger giganticNumber = new BigInteger("600851475143");

		ArrayList<BigInteger> primeNumbersFoundSoFar = new ArrayList<BigInteger>();
		primeNumbersFoundSoFar.add(new BigInteger("2"));
		
		for(BigInteger x = new BigInteger("3") ; lessThan(x, giganticNumber); x=x.add(BigInteger.ONE) ){
			Boolean xIsDefinitelyPrime = false;
			Boolean innerLoopSaysBreak = false;
			for(BigInteger prime : primeNumbersFoundSoFar){
				if(isDividedByPrime(x, prime)){
					innerLoopSaysBreak = true;
					break;
				}
				xIsDefinitelyPrime = true;			
			}
			if(!innerLoopSaysBreak){
				primeNumbersFoundSoFar.add(x);
				if(xIsDefinitelyPrime && lessThan(x,giganticNumber) && isDividedByPrime(giganticNumber,x)){
					System.out.println("Prime Factor Found , Value = "+ x);
				}
			}
		}
		

	}
	
	
	
	public static boolean isDividedByPrime(BigInteger x , BigInteger prime ){
		//Write logic here
		BigInteger remainder =  x.remainder(prime);
		
		if(equalsToZero(remainder)){
			return true;
		}
		return false;
	}
	
	public static boolean lessThan (BigInteger first, BigInteger second){
		if(first.compareTo(second)<0){
			return true;
		}
		return false;
	}

	
	public static boolean equalsToZero (BigInteger first){
		if(first.compareTo(BigInteger.ZERO)==0){
			return true;
		}
		return false;
	}
	
	
	public static boolean greaterThan (BigInteger first, BigInteger second){
		if(first.compareTo(second)>0){
			return true;
		}
		return false;
	}
	



}
