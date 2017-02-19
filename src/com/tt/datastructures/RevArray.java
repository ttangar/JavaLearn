package com.tt.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = Integer.parseInt(args[0]);
		List<Integer> inList = new ArrayList<>();
		for(int i=1; i<length+1; i++){
			inList.add(Integer.parseInt(args[i]));
		}
		System.out.println("Length: "+length+" List: "+inList);
		List<Integer> newList = new ArrayList<>();
		while(length>0){
			newList.add(inList.get(length-1));
			length--;
		}
		System.out.println("Reversed List: "+newList);
		Collections.sort(newList);
		System.out.println("Sorted List: "+newList);

	}

}
