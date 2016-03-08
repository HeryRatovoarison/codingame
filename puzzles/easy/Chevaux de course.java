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
        int N = in.nextInt();
        List<Integer> pi=new ArrayList();
        for (int i = 0; i < N; i++) {
            pi.add(in.nextInt());
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int D, diff;
        D=Integer.MAX_VALUE;
        Collections.sort(pi);
        for(int i=0; i<N-1; i++){
            diff=pi.get(i+1)-pi.get(i);
            if(diff<D) D=diff;
        }
        System.out.println(D);
    }
}
