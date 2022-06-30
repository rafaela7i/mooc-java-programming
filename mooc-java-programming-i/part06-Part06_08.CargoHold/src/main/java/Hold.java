
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (currentWeight + suitcase.totalWeight() > maxWeight) {
            return;
        }

        suitcases.add(suitcase);
        currentWeight += suitcase.totalWeight();
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no suitcases (" + currentWeight + " kg)";
        }

        if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + currentWeight + " kg)";
        }

        return suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }
}
