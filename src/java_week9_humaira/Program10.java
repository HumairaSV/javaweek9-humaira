package java_week9_humaira;

import java.util.Objects;
import java.util.Scanner;

/*
10. Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.

 */
public class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to London Zone 1: Travel made easy initiative");
        System.out.println("_____________________________________________________");
        System.out.println("Enter Zone 1 station name: ");
        String stationName = scan.nextLine().toLowerCase();
        checkStations(stationName);


    }

    public static void checkStations(String station){

        if(Objects.equals(station, "baker street")){
            System.out.println("Hammersmith & City and  Circle Lines pass through this station");
        }else if(Objects.equals(station, "barbican")){
            System.out.println("Metropolitan, Hammersmith & City and Circle lines pass through this station");
        }else if(Objects.equals(station, "covent garden")){
            System.out.println("Piccadilly line passes through this station");
        }else if(Objects.equals(station, "earl's court")){
            System.out.println("District line and Piccadilly line pass through this station");
        }else if(Objects.equals(station, "holborn")){
            System.out.println("Central line and Piccadilly line pass through this station");
        }else{
            System.out.println("Information for this Station is not available ");
        }
    }
}
