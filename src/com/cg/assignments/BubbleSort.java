package com.cg.assignments;

import java.util.Arrays;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
