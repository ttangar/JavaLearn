package com.tt.datastructures;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inString = "geeksforgeeks";
		String newString = null;
		int i=0;
		System.out.println(inString.length());
		while(i<inString.length()){
			System.out.println(i);
			if(i==inString.length()-1){
				newString = newString+inString.charAt(i);
				i++;
				continue;			
			}
			if(inString.charAt(i)!=inString.charAt(i+1)){
				if(newString == null){
					newString=String.valueOf(inString.charAt(i));
				}
				else{
					newString = newString+inString.charAt(i);
				}
				i++;
			}
			else{
				i=i+2;
			}
		}
		System.out.println(newString);
	}

}
