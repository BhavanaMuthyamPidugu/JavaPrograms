/** Java program to find month name from number provided using switch.
26-08-23.
MonthNameFromNum.java	*/

import java.io.*;
import java.util.*;
public class MonthNameFromNum{
	public static void main(String args[]){
		int mon_num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a month number(<=12) to find which month : ");
		mon_num=sc.nextInt();
		switch(mon_num){
			case 1: System.out.println("January is the month!");
				break;
			case 2: System.out.println("February is the month!");
				break;
			case 3: System.out.println("March is the month!");
				break;
			case 4: System.out.println("April is the month!");
				break;
			case 5: System.out.println("May is the month!");
				break;
			case 6: System.out.println("June is the month!");
				break;
			case 7: System.out.println("July is the month!");
				break;
			case 8: System.out.println("August is the month!");
				break;
			case 9: System.out.println("September is the month!");
				break;
			case 10: System.out.println("October is the month!");
				break;
			case 11: System.out.println("November is the month!");
				break;
			case 12: System.out.println("December is the month!");
				break;
			default:System.out.println("It's an invalid number of the months ! Enter valid month number between 1-12...");
		}
		System.out.println("Program completed.");
	}
}