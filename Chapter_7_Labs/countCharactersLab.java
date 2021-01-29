import java.util.Scanner;

public class countCharactersLab {
   
   /* Define your method here */
   public static int countCharacters(char userChar, String userString){
      int charCount = 0;
      for(int i = 0; i < userString.length(); i++){
         if(userChar == userString.charAt(i)){
            charCount += 1;
         }
         else{
         }
      }
      return charCount;
   }
   
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      char userChar = scnr.next().charAt(0);
      String userString = scnr.nextLine();
      System.out.println(countCharacters( userChar, userString));
   }
}
