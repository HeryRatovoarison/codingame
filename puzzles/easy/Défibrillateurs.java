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
        String LON = in.next();
        String LAT = in.next();
        int N = in.nextInt();
        in.nextLine();
        String[] DEFIB=new String[N];
        for (int i = 0; i < N; i++) {
            DEFIB[i] = in.nextLine();
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String closest, entry;
        double closestDist, dist;
        closestDist=getDist(LON, LAT, DEFIB[0]);
        closest=DEFIB[0];
        for(int i=1; i<DEFIB.length; i++){
            entry=DEFIB[i];
            dist=getDist(LON, LAT,entry);
            if(dist<closestDist){
                closestDist=dist;
                closest=entry;
            }
        }

        System.out.println(getNom(closest));
    }
    public static double getDist(double lon0, double lat0, double lon1, double lat1){
        double x=(lon1-lon0)*Math.cos((lat0+lat1)/2);
        double y=lat1-lat0;
        return (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)))*6371;
    }
    public static double getDist(String lon, String lat, String entry){
        double uLon=Double.parseDouble( lon.replace(",",".") );
        double uLat=Double.parseDouble( lat.replace(",",".") );
        String[] champ=entry.split(";");
        double dLon = Double.parseDouble( champ[champ.length-2].replace(",",".") );
        double dLat = Double.parseDouble( champ[champ.length-1].replace(",",".") );
        return getDist(uLon, uLat, dLon, dLat);
    }
    public static String getNom(String entry){
         return entry.split(";")[1];
    }
}
