package com.tt.datastructures;

public class FindQuadruple {
	
	public void findQuadruple(int[] arr, int n, int X){
		for(int i=0; i<n-3; i++){
			for(int j=i+1; j<n-2; j++){
				for(int k=j+1; k<n-1; k++){
					for(int l=k+1; l<n; l++){
						if(arr[i]+arr[j]+arr[k]+arr[l]==X){
							System.out.println("Elements::"+arr[i]+"::"+arr[j]+"::"+arr[k]+"::"+arr[l]);
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindQuadruple f = new FindQuadruple();
		int[] arrNumbers = {10,2,3,4,5,9,7,8};
		f.findQuadruple(arrNumbers, arrNumbers.length, 23);
		System.out.println(Math.pow(9, 3));
	}

}
