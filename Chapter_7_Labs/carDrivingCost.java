import java.util.Scanner;

public class carDrivingCost {
   
   /* Define your method here */
   public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon){
      return ((dollarsPerGallon/milesPerGallon) * drivenMiles);
   }
   
   public static void main(String[] args) {
      /* Type your code here. Your code must call the method.  */
      Scanner scnr = new Scanner(System.in);
      double drivenMiles;
      double milesPerGallon = scnr.nextDouble();
      double dollarsPerGallon = scnr.nextDouble();
      drivenMiles = 10;
      double tenMilesDriven = drivingCost(drivenMiles, milesPerGallon, dollarsPerGallon);
      drivenMiles = 50;
      double fiftyMilesDriven = drivingCost(drivenMiles, milesPerGallon, dollarsPerGallon);
      drivenMiles = 400;
      double fourhundredMilesDriven = drivingCost(drivenMiles, milesPerGallon, dollarsPerGallon);
      System.out.printf("%.2f", tenMilesDriven);
      System.out.print(" ");
      System.out.printf("%.2f", fiftyMilesDriven);
      System.out.print(" ");
      System.out.printf("%.2f", fourhundredMilesDriven);
      System.out.println();
   }
}
