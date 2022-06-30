
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(5);
        integers.add(99);
        integers.add(3);
        integers.add(12);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Volvo");
        strings.add("BMW");
        strings.add("Ford");
        strings.add("Mazda");

        System.out.println("Sorting arrays");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(cars));
        sort(array);
        sort(cars);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(cars));

        System.out.println();
        System.out.println("Sorting lists");
        System.out.println(integers);
        System.out.println(strings);
        sortIntegers(integers);
        sortStrings(strings);
        System.out.println(integers);
        System.out.println(strings);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
