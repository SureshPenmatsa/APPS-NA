package com.cg.strings;

import java.util.Arrays;

public class StringOperations {

	public static void main(String[] args) {
		String s="Java String pool refers to collection of Strings which are stored in heap memory";
		
		System.out.println("String in lowercase : "+s.toLowerCase());
		
		System.out.println("String in uppercase:"+s.toUpperCase());

		String s2=s.replace('a', '$');
		System.out.println("change the character a to $: "+s2);
		
//		char[] ch=s.toCharArray();
//		for(int i=0;i<s.length();i++) {
//			if(ch[i]=='a') {
//				ch[i]='$';
//			}
//		}
//		
//		String newString=Arrays.toString(ch);
//		System.out.println(newString);
		System.out.println("String contains the word collection: "+s.contains("collection"));
		
		System.out.println(s.equals("Java String pool refers to collection of strings which are stored in heap memory"));
		System.out.println(s.equalsIgnoreCase("Java String pool refers to collection of strings which are stored in heap memory"));
		
		
	}
}
