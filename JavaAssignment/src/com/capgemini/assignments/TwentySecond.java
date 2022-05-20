package com.capgemini.assignments;

public class TwentySecond {

	public static void main(String[] args) {
		String str = "HaveAGoodDay";
		System.out.println("Given string is: "+str);
		str=str.toLowerCase();
		int n =str.length();
		int[] freq = new int[26];
		for(int i=0;i<n;i++)
		freq[str.charAt(i) - 'a']++;
		System.out.println();
		System.out.print("Count of individual chars in the string is: ");
		for(int i=0;i<n;i++){
			if(freq[str.charAt(i) - 'a']!=0){
				System.out.print(str.charAt(i)+"=");
				System.out.print(freq[str.charAt(i) - 'a']+" ");
				freq[str.charAt(i)-'a']=0;
			}
		}
	}

}
