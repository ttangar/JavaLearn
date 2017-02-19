package com.tt.datastructures;

public class NthMagicNumer {
	public static int nthNumber(int n){
		
		int value = 0;
		int power = 5; 
		while(n != 0){
			
			if( (n&1) != 0){
				value += power ; 
			}
			
			power *= 5; 
			n >>= 1; 
		}
		
		return value ; 		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthMagicNumer n = new NthMagicNumer();
		int i=5;
		System.out.println("Binary representation for i: "+i+" is: "+Integer.toBinaryString(i));
		int retVal = n.nthNumber(i);
		System.out.println("nth Magic Number for i:"+i+" is: "+retVal);
	}

}
