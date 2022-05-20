package controlFlowStatements;

import java.util.Scanner;

public class ControlFlowStatements {

	public static void main(String[] args) {
		int a,flag=0;
		Scanner in = new Scanner(System.in);
		a= in.nextInt();
		for(int i=2;i<=a/2;i++){
			if(a%i==0){
			flag=1;
			break;
		}}
		if(flag==1)
		System.out.println(a+" is not prime");
		else
		System.out.println(a+" is prime");
	}

}
