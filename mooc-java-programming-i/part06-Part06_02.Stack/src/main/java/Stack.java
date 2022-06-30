
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
public class Stack {

    private ArrayList<String> s;

    public Stack() {
        this.s = new ArrayList<>();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public void add(String value) {
        s.add(0, value);
    }

    public ArrayList<String> values() {
        return s;
    }

    public String take() {
        return s.remove(0);
    }
}
