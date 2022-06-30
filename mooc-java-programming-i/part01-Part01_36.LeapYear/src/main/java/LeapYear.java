
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a Year:");
        int year = Integer.valueOf(scan.nextLine());
        
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if ( year % 100 == 0 && year % 400 != 0) {
            System.out.println("This is not a leap year.");
        } else {
            System.out.println("This is a leap year.");
        }

    }
}
