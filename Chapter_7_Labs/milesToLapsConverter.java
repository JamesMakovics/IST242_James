import java.util.Scanner;

public class milesToLapsConverter {
   
   /* Define your method here */
   public static double milesToLaps(double userMiles){
      return (userMiles / .25);
   }
   
   public static void main(String[] args) {
      /* Type your code here. Your code must call the method.  */
      Scanner scnr = new Scanner(System.in);
      double userMiles = scnr.nextDouble();
      System.out.printf("%.2f", milesToLaps(userMiles));
   }
}
