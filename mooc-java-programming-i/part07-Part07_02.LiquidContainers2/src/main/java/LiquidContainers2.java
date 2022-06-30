
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println();
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move") && amount <= first.contains()) {
                first.remove(amount);
                second.add(amount);
            } else if (command.equals("move") && amount > first.contains()) {
                amount = first.contains();
                second.add(amount);
                first.remove(100);
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }

        }
    }

}
