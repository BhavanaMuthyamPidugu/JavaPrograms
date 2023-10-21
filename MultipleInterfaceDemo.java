/** Java Program to demonstrate Multiple Inheritance using INTERFACEs.
 * MultipleInterfaceDemo.java   */
 
 import java.io.*;
 import java.util.*;
 interface Display{
     void display();
 }
 interface Show{
     void show();
 }
 class Print implements Display,Show{
     public void display(){
         System.out.println("Display Method.");
     }
     public void show(){
         System.out.println("Show Method.");
     }
     void print(){
         System.out.println("Print Method.");
         display();
         show();
     }
 }
 class  MultipleInterfaceDemo   implements Display, Show{
     public void display(){
         System.out.println("Display Method.");
     }
     public void show(){
         System.out.println("Show Method.");
     }
     public static void main(String args[]){
         System.out.println("In Main Method.");
         System.out.println();
          MultipleInterfaceDemo m=new  MultipleInterfaceDemo  ();
         m.display();
         m.show();
         Print p=new Print();
         System.out.println();
         System.out.println("In Print Method");
         System.out.println();
         p.print();
     }
 }
