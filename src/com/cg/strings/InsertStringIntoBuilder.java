package com.cg.strings;

public class InsertStringIntoBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("it is used to _ at the specified index position");
		sb.replace(sb.indexOf("_"), sb.indexOf("_")+1, "insert text");
		System.out.println(sb);
		
	}

}
