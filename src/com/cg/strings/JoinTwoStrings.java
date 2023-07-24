package com.cg.strings;

import java.util.Scanner;

public class JoinTwoStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first word");
		String s1=sc.nextLine();
		System.out.println("enter second word");
		String s2=sc.nextLine();
		System.out.println(s1.concat(s2));
	}

}
