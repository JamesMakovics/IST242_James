import java.util.Scanner;

public class isLeapYearLab {
    
    public static boolean isLeapYear(int userYear){
        if (((userYear % 4 == 0) && (userYear % 100!= 0)) || (userYear%400 == 0))
         return true;
      else
         return false;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int userYear = scnr.nextInt();

        if(isLeapYear(userYear) == true){
            System.out.println(userYear + " is a leap year.");
        }
        else{
            System.out.println(userYear + " is not a leap year.");
        }
    }
}
