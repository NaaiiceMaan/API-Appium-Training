package com.capgemini.assignments;

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		int[][] A=new int[3][3];
		int[][] B=new int[3][3];
		int[][] C=new int[3][3];


		int r,j,i;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter size of the 2 square matrices: ");
		r= in.nextInt();
		System.out.println("Enter elements of 1st matrix: ");
		for(i=0;i<r;i++) 
			for(j=0;j<r;j++)
				A[i][j]=in.nextInt();
		System.out.println("Enter elements of 2nd matrix: ");
		for(i=0;i<r;i++) 
			for(j=0;j<r;j++)
				B[i][j]=in.nextInt();
		System.out.println("Added Matrices is:");
		for(i=0;i<r;i++) {
			for(j=0;j<r;j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}
}
