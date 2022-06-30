
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count = new Counter();
        Counter test = new Counter(5);
        count.increase();
        count.increase();
        System.out.println(count.value());
        System.out.println(test.value());
        count.decrease();
        test.decrease(-5);
        System.out.println(count.value());
        System.out.println(test.value());
    }
}
