/**Java program to demonstrate PRIVATE ACCESS SPECIFIERS.
PrivateSpecifierDemo.java	*/

import java.io.*;
import java.util.*;
class Sample{
    private String activity;
    public String task;
}
public class Main{
    public static void main(String args[]){
        Sample s=new Sample();
        s.activity="Playing";
        s.task="Eating";
        System.out.println("Activity is "+s.activity);
        System.out.println("Task is "+s.task);
    }
}
/*  Output will be an error that activity has private access in Sample.  */
	
