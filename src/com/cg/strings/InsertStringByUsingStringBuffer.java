package com.cg.strings;

public class InsertStringByUsingStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("it is used to _ at the specified index position");
		
		sb.replace(sb.indexOf("_"), sb.indexOf("_")+1, "insert text");
		System.out.println(sb);
		
	}

}
