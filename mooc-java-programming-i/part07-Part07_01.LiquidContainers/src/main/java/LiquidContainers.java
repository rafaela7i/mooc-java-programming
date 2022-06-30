
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println();
            System.out.println("First: " + first + "/" + 100);
            System.out.println("Second: " + second + "/" + 100);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                first += amount;
            }
            
            if (command.equals("move") && amount <= first) {
                first -= amount;
                second += amount;
            } else if (command.equals("move") && amount > first) {
                amount = first;
                second += amount;
                first = 0;
            }
            
            if (command.equals("remove") && amount <= second) {
                second -= amount;
            } else if (command.equals("remove") && amount > second) {
                second = 0;
            }
            
            if (first > 100) {
                first = 100;
            }
            
            if (second > 100) {
                second = 100;
            }

        }
    }

}
