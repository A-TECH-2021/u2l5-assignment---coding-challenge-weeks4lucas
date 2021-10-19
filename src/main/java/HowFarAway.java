package main.java;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        System.out.print("Enter the latitude of the starting location: ");
        Scanner startLat = new Scanner(System.in);
        double begLat = startLat.nextDouble();
        System.out.println(startLat);
        System.out.print("Enter the longitude of the starting location: ");
        Scanner startLong = new Scanner(System.in);
        double begLong = startLong.nextDouble();
        System.out.println(startLong);
        System.out.print("Enter the latitude of the ending location: ");
        Scanner stopLat = new Scanner(System.in);
        double endLat = stopLat.nextDouble();
        System.out.println(stopLat);
        System.out.print("Enter the longitude of the ending location: ");
        Scanner stopLong = new Scanner(System.in);
        double endLong = stopLong.nextDouble();
        System.out.println(stopLong);

        GeoLocation geoStart = new GeoLocation(begLat,begLong);
        GeoLocation geoEnd = new GeoLocation(endLat,endLong);
        double distance = geoStart.distanceFrom(geoEnd);
        System.out.println("The distance is " + distance);
    }
}
