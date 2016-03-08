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
        int L = in.nextInt();
        int H = in.nextInt();
        in.nextLine();
        String T = in.nextLine(); //chars to translate into ASCII
        String[] ROWS=new String[H]; //ASCII rows
        for (int i = 0; i < H; i++) {
             ROWS[i]= in.nextLine();
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String[] answer=new String[H]; //ASCII rows result
        for(int i=0; i<T.length(); i++){
           int index=getAlphIndexOf(T.charAt(i));
           for(int j=0; j<answer.length; j++){
                if(answer[j]==null) answer[j]="";
                
                int startRange=(index*(L))-(L);
                answer[j]+=ROWS[j].substring(startRange,startRange+L);
           }
        }
        //final output
        for(String s: answer) System.out.println(s);
    }
    public static int getAlphIndexOf(char letter){
       int result=27;
        if(letter>='A' && letter<='Z')
            result= (int)(letter - 'A'+1);
        if(letter>='a' && letter<= 'z')
            result= (int)(letter - 'a'+1);
        return result;
    }
}
