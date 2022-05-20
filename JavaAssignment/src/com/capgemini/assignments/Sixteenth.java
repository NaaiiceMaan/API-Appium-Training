package com.capgemini.assignments;

import java.util.Scanner;

public class Sixteenth {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.println("The table of "+num+" is: ");
		for(int i=1;i<=10;i++)
		System.out.println(num+"*"+i+"="+num*i);

	}

}
