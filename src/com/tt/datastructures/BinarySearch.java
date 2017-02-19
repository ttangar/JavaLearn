package com.tt.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	
	static List<Integer> listBinary = new ArrayList<>(); 
	
	public int recursiveBS(int start, int end, int key){
		int retIndex = -(start+1);
		if(start<end){
			int mid = start + (end-start)/2;
			if(key<listBinary.get(mid))
				recursiveBS(start, mid, key);
			else if(key>listBinary.get(mid))
				recursiveBS(mid+1, end, key);
			else{
				retIndex = mid;
			}
		}
		return retIndex;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		listBinary.add(2);
		listBinary.add(20);
		listBinary.add(5);
		listBinary.add(8);
		listBinary.add(23);
		listBinary.add(38);
		listBinary.add(49);
		listBinary.add(9);
		listBinary.add(91);
		listBinary.add(72);
		listBinary.add(16);
		listBinary.add(12);
		System.out.println("List: "+listBinary);
		Collections.sort(listBinary);
		System.out.println("Sorted List: "+listBinary);
		int index = Collections.binarySearch(listBinary, 20);
		System.out.println("Collections Search: Index for 20: "+index);
		index = bs.recursiveBS(0,listBinary.size(), 49);
		System.out.println("Recursive Binary Search: Index for 49: "+index);
	}

}
