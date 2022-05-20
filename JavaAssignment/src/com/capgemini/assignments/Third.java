package com.capgemini.assignments;

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		String string;
		int flag=0;
		Scanner in = new Scanner(System.in);
		string = in.next();
		for(int i=0, j=string.length()-1;i<string.length()/2;i++,j--){
		if(string.charAt(i)==string.charAt(j))
			flag=1;
		else{
			flag=0;
			break;
			}
		}
		if(flag==1)
		System.out.println(string+" is palindrome.");
		else
		System.out.println(string+" is not palindrome");
	}
}
