package com.capgemini.assignments;

import java.util.Scanner;

public class Fifteenth {

	public static void main(String[] args) {
		char ch;
		Scanner in = new Scanner(System.in);
		ch = in.next().charAt(0);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			System.out.println("entered input is an alphabet");
		else
			System.out.println("entered input is not an alphabet");

	}

}
