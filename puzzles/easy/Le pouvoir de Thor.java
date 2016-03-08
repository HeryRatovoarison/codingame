import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        String mH, mV;
        int nbH, nbV;
        
        String[] moves;
        
        mH=(initialTX<lightX)?"E":"W";
        mV=(initialTY<lightY)?"S":"N";
        
        nbH=Math.abs(initialTX-lightX);
        nbV=Math.abs(initialTY-lightY);
        
        int max=Math.max(nbV,nbH);
        int min=Math.min(nbV,nbH);
        
        moves=new String[max];
        for(int i=0; i<max; i++)
        {
            if(i<min) moves[i]=mV+mH;
            else moves[i]=(nbH<nbV)?mV:mH;
        }
        
        // game loop
        for (int index=0;true;index++) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            System.out.println(moves[index]); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
} 
