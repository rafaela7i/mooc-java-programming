
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account rafasAccount = new Account("Rafa's account", 100.00);
        
        System.out.println("Initial state");
        System.out.println(rafasAccount);
        
        rafasAccount.deposit(20);
        System.out.println("After deposit");
        System.out.println(rafasAccount);
    }
}
