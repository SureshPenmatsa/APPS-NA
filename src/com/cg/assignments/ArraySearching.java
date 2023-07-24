package com.cg.assignments;

import java.util.Scanner;

public class ArraySearching {
	static int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	public static boolean isPresent(int num) {
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isPresent(num)) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		
		
	}

}
