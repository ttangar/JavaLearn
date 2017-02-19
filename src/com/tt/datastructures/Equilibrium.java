package com.tt.datastructures;

public class Equilibrium {
	
	public int equilibriumCheck(int[] arr){
		for(int i=0; i<arr.length-1;i++){
			int j, k;
			int sumBefore = 0, sumAfter=0;
			j=0; k=arr.length-1;
			while(j<i && k>i){
				sumBefore+=arr[j];
				sumAfter+=arr[k];
				j++; k--;
			}
			System.out.println("SumBefore: "+sumBefore+" SumAfter: "+sumAfter);
			if((sumBefore==sumAfter) && (sumBefore!=0||sumAfter!=0)){
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,2,2};
		Equilibrium e = new Equilibrium();
		int retVal = e.equilibriumCheck(arr);
		System.out.println("Equilibrium obtained at: "+retVal);
	}

}
