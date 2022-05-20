package com.capgemini.assignments;

public class Fourth {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int item: arr)
		sum+=item;
		float avg = sum/arr.length;
		System.out.println(avg);

	}
}
