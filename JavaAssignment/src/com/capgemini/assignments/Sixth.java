package com.capgemini.assignments;

public class Sixth {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2={4,5,6};
		int[] result= new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		result[i] = arr1[i];
		for(int i=arr1.length,j=0;i<result.length && j<arr2.length;i++,j++)
		result[i] = arr2[j];
		for(int i=0; i<result.length;i++)
		System.out.println(result[i]);
	}
}
