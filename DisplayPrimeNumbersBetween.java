import java.io.*;
import java.util.*;
class DisplayPrimeNumbersBetween{
    static {//static block
        System.out.println("/* Java Program to display Prime numbers in between TWO numbers.");
        System.out.println("User : Bhavana.");
        System.out.println("Created on : 23-09-23. */");
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);//object for scanner to take input
        System.out.print("Enter first number in range : ");
        int num1=scan.nextInt();//reading number from user
        System.out.print("Enter second number in range : ");
        int num2=scan.nextInt();
        if(num1<0||num2<0){
            System.out.println("The one of the given numbers is negative !!!");
            System.out.println("Cannot display Prime Numbers in between !");
        }else{
            if(num1>num2){
                int t=num1;
                num1=num2;
                num2=t;
            }
            System.out.println("The Prime Numbers in between the numbers "+num1+" and "+num2+" are :");
            int print_flag=0;
            for(int j=num1;j<=num2;j++){
                int flag=1;
                for(int i=2;i<j/2;i++){
                    if(j%i==0){
                        flag=0;
                        break;
                    }
                }
                if(flag==1&&j!=0&&j!=1){
                    print_flag=1;
                    //PRIME Number
                    System.out.println(j);
                }/*else{    NOT PRIME Number    COMPOSITE Number    No need to display}*/
            }
            if(print_flag==0){
                System.out.println("Nothing.");//There are no prime numbers in between the given numbers.")
            }else{
                System.out.println("These are the required Prime Numbers in between !!!");
            }
        }//else close
    }//main close
}