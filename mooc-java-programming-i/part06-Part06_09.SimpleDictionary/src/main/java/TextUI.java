
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafaela
 */
public class TextUI {

    private Scanner scan;
    private SimpleDictionary book;

    public TextUI(Scanner scan, SimpleDictionary book) {
        this.scan = scan;
        this.book = book;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            if (command.equals("end")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.print("Translation: ");
                String translation = scan.nextLine();
                book.add(word, translation);
                continue;
            }

            if (command.equals("search")) {
                search();
                continue;
            }

            System.out.println("Unknown command");
        }

        System.out.println("Bye bye!");
    }

    public void search() {
        System.out.print("To be translated: ");
        String word = scan.nextLine();
        if (book.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + book.translate(word));
        }
    }

}
