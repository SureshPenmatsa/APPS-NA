package com.cg.assignments;

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter CTC ");
		int income=sc.nextInt();
		
		
		if(income>=0 && income<=180000) {
		System.out.println("there is no tax");
		}
		else if(income>181000 && income<=300000) {
			System.out.println(0.1*income);
		}
		else if(income>300000&& income<=500000) {
			System.out.println(0.2*income);
		}
		else if(income>500000&& income<=1000000) {
			System.out.println(0.3*income);
		}

	}

}
