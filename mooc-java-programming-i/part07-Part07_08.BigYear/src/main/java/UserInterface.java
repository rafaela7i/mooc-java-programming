
import java.util.ArrayList;
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
public class UserInterface {

    private Scanner scan;
    private ArrayList<Bird> birdDatabase;

    public UserInterface(Scanner scan, ArrayList<Bird> birdDatabase) {
        this.scan = scan;
        this.birdDatabase = birdDatabase;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                add();
            }

            if (command.equals("Observation")) {
                observation();
            }

            if (command.equals("All")) {
                all();
            }

            if (command.equals("One")) {
                one();
            }
        }
    }

    private void observation() {
        System.out.print("Bird? ");
        String name = scan.nextLine();

        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                bird.observe();
                break;
            }

            System.out.println("Not a bird!");
        }
    }

    private void all() {
        for (Bird bird : birdDatabase) {
            System.out.println(bird);
        }
    }

    private void add() {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();

        birdDatabase.add(new Bird(name, latinName));
    }

    private void one() {
        System.out.print("Bird? ");
        String name = scan.nextLine();

        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                break;
            }
        }
    }

}
