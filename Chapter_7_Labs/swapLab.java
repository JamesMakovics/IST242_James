import java.util.Scanner;

public class swapLab {
   
   /* Define your method here */
   public static void swapValues(int[] values){
    int firstNum = values[0];
    values[0] = values[values.length - 1];
    values[values.length - 1] = firstNum;
   }
   public static void main(String[] args) {
      /* Type your code here. */
      int[] values = new int[2];
      Scanner scnr = new Scanner(System.in);
      values [0] = scnr.nextInt();
      values [1] = scnr.nextInt();
      swapValues(values);
      System.out.print(values[0]);
      System.out.println(" " + values[values.length - 1]);
   }
}
