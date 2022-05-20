package com.capgemini.assignments;

public class TwentyNineth {

	public static void main(String[] args) {
		String str = "aaveAGoodDay";
		System.out.println("Given string is: "+str);
		str=str.toLowerCase();
		int n =str.length();
		int[] freq = new int[26];
		for(int i=0;i<n;i++)
		freq[str.charAt(i) - 'a']++;
		System.out.println();
		for(int i=0;i<n;i++){
			if(freq[str.charAt(i) - 'a']!=0){
				if(freq[str.charAt(i) - 'a']==1) {
					System.out.println("The first non repeating character in the string is: "+str.charAt(i));
					break;
				}
			}
		}
	}

}
