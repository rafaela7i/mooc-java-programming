
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            while (reader.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                people.add(new Person(name, age));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
