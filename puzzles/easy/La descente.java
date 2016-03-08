import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int highestIndex=0, highestH,mountainH;
        // game loop
        while (true) {
            highestH=0;
            for (int i = 0; i < 8; i++) {
                mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0.
                if(mountainH>highestH) {
                    highestIndex=i;
                    highestH=mountainH;
                }
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(highestIndex); // The number of the mountain to fire on.
        }
    }
} 
