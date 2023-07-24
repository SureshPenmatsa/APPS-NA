package com.cg.assignments;

import java.util.List;
import java.util.Scanner;


public class SubjectsAndMarks {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the subject1");
		String s1=sc.nextLine();
		System.out.println("enter the marks obtained for subject1");
		int m1=sc.nextInt();
		System.out.println("enter the name of the subject2");
		String s2=sc.next();
		System.out.println("enter the marks obtained for subject2");
		int m2=sc.nextInt();
		System.out.println("enter the name of the subject3");
		String s3=sc.next();
		System.out.println("enter the marks obtained for subject3");
		int m3=sc.nextInt();
		
		if(m1>60 && m2>60 && m3>60) {
			System.out.println("pass");
		}
		else if((m1>60 && m2>60 && m3<=60)||(m1<=60 && m2>60 && m3>60)||(m1>60 && m2<=60 && m3>60)) {
			System.out.println("promoted");
		}
		else {
			System.out.println("fail");
		}
	}

}
