/**Java program to find average of the student using else-if ladder.
26-08-23.
AvgElseIfLadder.java	*/

import java.io.*;
import java.util.*;
public class AverageElseIfLadder{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of Subjects : ");
        int n=scan.nextInt();
        double s[]=new double[n];
        double total=0.0,avg;
        System.out.println("Enter MARKS of "+n+" subjects out of 100:");
        for(int i=0;i<n;i++){
            s[i]=scan.nextDouble();
            if(s[i]>100){
                System.out.println("You entered marks greater than 100 !!!.");
                System.out.println("Program terminated abruptly !");
                System.exit(0);
            }
            total+=s[i];
        }
        avg=total/n;
        System.out.println("YOUR SCORE :");
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
        if(avg>=92&&avg<=100){
            System.out.println("Grade : A+");
        }else if(avg>=80&&avg<=92){
            System.out.println("Grade : A");
        }else if(avg>=70&&avg<80){
            System.out.println("Grade : B");
        }else if(avg>=60&&avg<70){
            System.out.println("Grade : C");
        }else if(avg>=50&&avg<60){
            System.out.println("Grade : D");
        }else if(avg>=40&&avg<50){
            System.out.println("Grade : E");
        }else{
            System.out.println("Fail");
        }
    }
}
	
