import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String[] parsed=temps.split("\\s+");
        int current=5526, temp;
        if(temps.length()==0) current=0;
        else for(String s:parsed){
            temp=Integer.parseInt(s);
            if(Math.abs(temp)<Math.abs(current)){
                current=temp;
            }
            else if(Math.abs(temp)==Math.abs(current)) {
                current=(current>temp)?current:temp;
            }
        }
        System.out.println(current);
    }
}
