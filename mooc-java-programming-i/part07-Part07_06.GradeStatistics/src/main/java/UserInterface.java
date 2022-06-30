
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

    private GradeStatistics stats;
    private Scanner scanner;

    public UserInterface(GradeStatistics stats, Scanner scanner) {
        this.stats = stats;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("Point average (all): " + stats.averageOfPoints());
        printPassing();
        System.out.println("Pass percentage: " + stats.passPercentage());
        printGradeDistribution();
    }

    private void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            stats.addPoints(input);
        }
    }

    public void printPassing() {
        if (stats.passingAverage() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + stats.passingAverage());
        }
    }

    private void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ":");
            printStars(stats.numberOfGrades(grade));
            System.out.println();
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

}
