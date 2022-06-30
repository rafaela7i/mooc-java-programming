
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafaela
 */
public class GradeStatistics {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public GradeStatistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoints(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
            this.grades.add(pointsToGrade(points));
        }
    }

    public double averageOfPoints() {
        if (points.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (Integer p : points) {
            sum += p;
        }

        return 1.0 * sum / points.size();
    }

    public double passingAverage() {
        int sum = 0;
        int count = 0;
        for (Integer p : points) {
            if (p >= 50) {
                sum += p;
                count += 1;
            }
        }

        if (count == 0) {
            return 0;
        }

        return 1.0 * sum / count;
    }

    public double passPercentage() {
        int passing = 0;
        for (Integer p : points) {
            if (p >= 50) {
                passing += 1;
            }
        }

        return 100.0 * passing / points.size();
    }

    public static int pointsToGrade(int points) {
        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

}
