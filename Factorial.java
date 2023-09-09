/**Java Program for finding factorial.
26-08-23.
Factorial.java*/

import java.io.*;
import java.util.*;

class Factorial{
	public static void main(String args[]){
		int n,pro=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer(>=0) to find factorial : ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			pro*=i;
		}
		System.out.println("The factorial of "+n+" is = "+n+"! = "+pro);
	}
}