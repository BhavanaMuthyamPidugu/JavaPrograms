import java.io.*;
public class CmdLineArgsV2 {
    public static void main(String args[]){
        if(args.length!=2) {//no paranthesis for the ..length'' method only which calculate number of characters
            System.out.println("Invalid number of arguments !!! \n You need to pass TWO Integers !");
        }else{
            float x = Float.parseFloat(args[0]);
            float y = Float.parseFloat(args[1]);
            float z = x+y;
            System.out.println("The Sum of two integers "+ x +" and " + y +" is "+(x+y));
        }
    }
}