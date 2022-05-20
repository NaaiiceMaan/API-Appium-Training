package com.capgemini.assignments;

public class TwentySixth {

	public static void main(String[] args) {
		String str = "asd231dawd4523df";
		str = str.replaceAll("[^\\d]"," ");
		str = str.trim();
		str= str.replaceAll(" +","");
		System.out.println(str);
	}

}
