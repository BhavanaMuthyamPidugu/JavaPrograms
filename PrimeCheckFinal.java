import java.io.*;
import java.util.*;
public class PrimeCheckFinal{
    static {//static block
        System.out.println("/* Java Program to check a number Prime or not.");
        System.out.println("User : Bhavana.");
        System.out.println("Created on : 23-09-23. */");
    }
    public static void main(String args[]){
        //int num;
        Scanner scan=new Scanner(System.in);//object for scanner to take input
        System.out.print("Enter a number to check whether it's prime or not : ");
        int num=scan.nextInt();//reading number from user
        if(num<0){
            System.out.println("The given number "+num+" is a negative number.");
        }else if(num==0||num==1){
            System.out.println("The number "+num+"is neither prime nor composite number.");
        }else{
            int flag=1;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println("The given number "+num+" is a PRIME Number.");
            }else{
                System.out.println("The given number "+num+" is NOT PRIME Number.");
                System.out.println("It's a COMPOSITE Number.");
            }
        }//else close
    }//main close
}