import java.util.Scanner;

public class stepsToMilesConverter {
   
   /* Define your method here */
   public static double stepsToMiles(int userSteps){
       double stepsTaken = userSteps;
        return (stepsTaken / 2000);
   }
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int userSteps = scnr.nextInt();
      System.out.printf("%.2f", stepsToMiles(userSteps));
   }
}
