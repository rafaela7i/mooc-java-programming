
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
public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        return room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return room;
    }

    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }

        Person shortest = room.get(0);
        for (Person person : room) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }

    public Person take() {
        if (room.isEmpty()) {
            return null;
        }

        return room.remove(room.indexOf(this.shortest()));
    }

}
