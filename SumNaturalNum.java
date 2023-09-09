/**Java Program to get sum of first n natural numbers.
26-08-23.
SumNaturalNum.java	*/

import java.io.*;
import java.util.*;
public class SumNaturalNum{
	public static void main(String[] args){
		int n,sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive natural number to find the sum :");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("The sum of first "+n+" natural numbers is = "+sum);
	}
}