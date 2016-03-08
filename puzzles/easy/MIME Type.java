import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Hashtable<String,String> hash=new Hashtable();
        String[] fnames;
        String mime;
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            hash.put(EXT.toUpperCase(),MT);
            in.nextLine();
        }
        fnames=new String[Q];
        for (int i = 0; i < Q; i++) {
            fnames[i] = in.nextLine(); // One file name per line.
        }
        for (int i = 0; i < Q; i++) {
            mime=null;
            String[] filename=fnames[i].split("\\.(?=[^\\.]+$)");
            if(filename.length>1) mime=hash.get(filename[filename.length-1].toUpperCase());
            if(mime==null) mime="UNKNOWN";
            System.out.println(mime);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("UNKNOWN"); // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    }
}
