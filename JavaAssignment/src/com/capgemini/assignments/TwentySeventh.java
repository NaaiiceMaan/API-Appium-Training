package com.capgemini.assignments;

public class TwentySeventh {

	public static void main(String[] args) {
		int[] arr= {1,0,7,8,6,4,0,0};
		int count =0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=0)
				arr[count++]=arr[i];
		while(count<arr.length)
			arr[count++]=0;
		for(int items:arr)
		System.out.print(items+" ");

	}

}
