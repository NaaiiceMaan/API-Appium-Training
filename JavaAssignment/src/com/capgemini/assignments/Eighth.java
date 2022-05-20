package com.capgemini.assignments;

public class Eighth {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int search=3, flag=0;
		for(int item:arr){
		if(item==search){
			flag=1;
			System.out.println("Searched item found");
			break;
		}}
		if(flag==0)
		System.out.println("Searched item not found");
	}
}
