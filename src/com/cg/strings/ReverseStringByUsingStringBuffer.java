package com.cg.strings;

public class ReverseStringByUsingStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("This method returns the reversed object on which it was called");
		sb.reverse();
		System.out.println(sb);
	}

}
