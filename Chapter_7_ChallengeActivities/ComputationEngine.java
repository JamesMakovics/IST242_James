public class ComputationEngine {
   public static int compute(int val1, int val2, int val3) {
      final int NUM_VALUES = 3;
      int[] numbers = new int[NUM_VALUES];

      numbers[0] = val1;
      numbers[1] = val2;
      numbers[2] = val3;
       
      int i;
      int result = 1;
       
      for (i = 0; i < numbers.length; ++i) {
         result *= numbers[i] - 3;
      }
      return result;
   }
    
   public static void main(String[] args) {
      int value1 = 4;
      int value2 = 2;
      int value3 = 3;
   
      int computedValue = compute(value1, value2, value3);
      System.out.println(computedValue);
   }
}
