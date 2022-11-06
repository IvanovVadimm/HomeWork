package IvanovVadimHW12;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> collection;

    public AnimalCollection() {
        this.collection = new LinkedList<String>();
    }

    public void addAnimalInEnd(String... animal) {
        for (int i = 0; i < animal.length; i++) {
            this.collection.addLast(animal[i]);
        }
    }

    public void deleteAnimalFromStart() {
        this.collection.remove(0);
    }

    public void getCollection() {
        for (String animals : this.collection) {
            System.out.print(animals + ", ");
        }
    }
}
