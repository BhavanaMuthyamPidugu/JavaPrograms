import java.io.*;
public class CmdLineArgs {
    public static void main(String args[]){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("The Sum of two integers "+ x +" and " + y +" is "+z);
    }
}