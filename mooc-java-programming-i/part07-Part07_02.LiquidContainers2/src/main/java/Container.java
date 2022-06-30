/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaela
 */
public class Container {

    private int content;

    public Container() {
        this.content = 0;
    }

    public int contains() {
        return content;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (content + amount > 100) {
            content = 100;
            return;
        }

        content += amount;
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (content - amount < 0) {
            content = 0;
            return;
        }

        content -= amount;
    }

    @Override
    public String toString() {
        return content + "/100";
    }

}
