package com.tt.datastructures;

import java.util.ArrayList;
import java.util.List;

public class DistinctNumber {
	public List<Integer> findDistinctNumbers(int[] arr){
		List<Integer> distnctNum = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			System.out.println("element i: "+arr[i]);
			int j=0;
			boolean iDuplicate=false;
			while(j<arr.length){
				if(arr[i]==arr[j] && j!=i)
					iDuplicate=true;
				j++;
			}
			if(!iDuplicate)
				distnctNum.add(arr[i]);
		}
		return distnctNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctNumber d = new DistinctNumber();
		int[] inArr = {1,2,3,2,1,4};
		List<Integer> outList = d.findDistinctNumbers(inArr);
		System.out.println(outList);
	}

}
