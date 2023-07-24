package com.cg.assignments;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String userName="suresh";
		String password="Suresh123";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String u1=sc.next();
		System.out.println("enter password");
		String p1=sc.next();
		
		if(userName.equals(u1) && password.equals(p1)) {
			
			System.out.println("Welcome "+userName);
		
		}
		
		else {
			System.out.println("invalid credentials");
			int count=1;
			
			while(count<3) {
				
				
				System.out.println("enter username");
				String u2=sc.next();
				System.out.println("enter password");
				String p2=sc.next();
				if(userName==u2&&password==p2) {
					System.out.println("Welcome "+userName);
				}
				else {
					count++;
					System.out.println("invalid credentials");
				}
				
			}
			if(count==3) {
				System.out.println("contact admin! you attempted too many times");
			}

		}
		

	}

}
