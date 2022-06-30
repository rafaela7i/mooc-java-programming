/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaela
 */
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public void observe() {
        observations++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (observations == 1) {
            return name + " (" + latinName + "): " + observations + " observation";
        }

        return name + " (" + latinName + "): " + observations + " observations";
    }

}
