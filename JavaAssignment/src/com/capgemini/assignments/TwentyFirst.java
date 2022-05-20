package com.capgemini.assignments;

import java.util.Scanner;

public class TwentyFirst {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num= in.nextInt();
		if(num%2==0)
		System.out.println(num+" is even");
		else
		System.out.println(num+" is odd");

	}

}
