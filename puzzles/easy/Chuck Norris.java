import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) throws UnsupportedEncodingException{
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.err.println(MESSAGE);
        String output="", byteString="";
        byte[] bytes=MESSAGE.getBytes("US-ASCII");
        for(byte b:bytes) byteString+=(String.format("%7s",Integer.toBinaryString(b))).replace(' ', '0');
        System.err.println(byteString);
        char current='2';
        for(int i=0; i<byteString.length(); i++){
            if(byteString.charAt(i)!=current) {
                current=byteString.charAt(i);
                if(!output.isEmpty()) output+=" ";
                if(current=='1') output+="0 0";
                else output+="00 0";
            }
            else output+="0";
        }
        //final output
        System.out.println(output);
    }
}
