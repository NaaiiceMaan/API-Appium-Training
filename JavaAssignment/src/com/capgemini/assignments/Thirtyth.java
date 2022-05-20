package com.capgemini.assignments;

public class Thirtyth {

	public static void main(String[] args) {
		 int i, j,n=5,num=1;
	     for(i=0; i<n; i++) {
	    	 for(j=2*(n-i); j>=0; j--)
	    		 System.out.print(" ");
	         for(j=0; j<=i; j++)
	        	 System.out.print("* ");
	         System.out.println();
	      }
         System.out.println();

	     
	     for (i=0; i<n; i++) {
	            for (j=n-i; j>1; j--)
	                System.out.print(" ");
	            for (j=0; j<=i; j++ )
	                System.out.print("* ");
	            System.out.println();
	      }
         System.out.println();

	     
	     for (i = 1; i <= n; i++) {
	          for (j = 1; j < i; j++)
	                System.out.print(" ");
	          for (j = i; j <= n; j++)
	                System.out.print(j+" ");
	            System.out.println();
	      }
         System.out.println();

	     
	     for(i=0; i<n; i++) {
	            num=1;
	            for(j=0; j<=i; j++) {
	                System.out.print(num+ " ");
	                num++;
	            }
	            System.out.println();
	      } 
         System.out.println();

	     num=1;
	     for(i=0; i<n; i++) {
	            for(j=0; j<=i; j++) {
	                System.out.print(num+ " ");
	                num = num + 1;
	            }
	            System.out.println();
	      }
	     
	}

}
