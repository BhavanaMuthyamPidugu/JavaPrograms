import java.io.*;
public class CmdLineArgsV3 extends Object {	//command line arguments
    public static void main(String args[]){	//single-level Inheritance
        CmdLineArgsV3 obj = new CmdLineArgsV3();
        if(args.length!=2) {		//no paranthesis for the ..length'' method only which calculate number of characters
            System.out.println("Invalid number of arguments !!! \n You need to pass TWO Integers !");		//escape sequence
        }else{		//airthmetic operator
            float x = Float.parseFloat(args[0]);	//Wrapper classes
            float y = Float.parseFloat(args[1]);
            float z = x+y;
            System.out.println("The Sum of two integers "+ x +" and " + y +" is "+(x+y));
            System.out.println("The class name is : "+ obj.getClass());		//obj class - getCLass Method
        }
    }
}