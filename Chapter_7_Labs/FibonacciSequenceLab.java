import java.util.Scanner;

public class FibonacciSequenceLab {
   
   public static int fibonacci(int n) {
      int n1 = 0, n2 = 1, fib = -1;
      if(n < 0){
          return fib;
      }
      else if(n == 0){
          fib = n;
          return fib;
      }
      else{
          for(int i = 1; i < n; i++){
              fib = n1 + n2;
              n1 = n2;
              n2 = fib;
          }
          return fib;
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonnacci(" + startNum + ") is " + fibonacci(startNum));
   }
}