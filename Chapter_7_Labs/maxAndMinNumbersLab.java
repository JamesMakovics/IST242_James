import java.util.Scanner; 
public class maxAndMinNumbersLab {

    public static int largestNumber(int num1, int num2, int num3){
        if(num1 >= num2 && num1 >= num3){
            return num1;
        }
        else if( num2 >= num1 && num2 >= num3){
            return num2;
        }
        else{
            return num3;
        }
    }
    public static int smallestNumber(int num1, int num2, int num3){
        if(num1 <= num2 && num1 <= num3){
            return num1;
        }
        else if( num2 <= num1 && num2 <= num3){
            return num2;
        }
        else{
            return num3;
        }
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        int num3 = scnr.nextInt();
        System.out.println("largest: " + largestNumber(num1, num2, num3));
        System.out.println("smallest: " + smallestNumber(num1, num2, num3));
    }
}
