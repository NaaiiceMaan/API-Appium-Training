package com.capgemini.assignments;

import java.util.Scanner;

public class Eighteenth {

	public static void main(String[] args) {
		String words;
		Scanner in = new Scanner(System.in);
		words= in.nextLine();
		words=words.toLowerCase();
		int count=0;
		for(int i=0;i<words.length();i++)
			if(words.charAt(i)=='a'||words.charAt(i)=='e'||words.charAt(i)=='i'||words.charAt(i)=='o'||words.charAt(i)=='u')
				count++;
		System.out.println("Total no of vowels in the sentnece are: "+count);

	}

}
