package com.capgemini.assignments;

public class TwentyEighth {

	public static void main(String[] args) {
		String str = new String();
		String string = "fsefqfwadfawd";
		int len = string.length();
		for(int i=0;i<len;i++){
		char c=string.charAt(i);
		if(str.indexOf(c)<0)
		str+=c;
		}
		System.out.println(str);
	}
}
