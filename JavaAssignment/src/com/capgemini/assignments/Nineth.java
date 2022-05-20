package com.capgemini.assignments;

public class Nineth {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int max=arr[0];
		for(int item:arr)
			if(item>max)
				max=item;
		System.out.println("largest element of the array is: "+max);
	}
}
