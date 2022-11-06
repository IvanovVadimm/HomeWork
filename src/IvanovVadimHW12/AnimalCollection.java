package IvanovVadimHW12;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> collection = new LinkedList<String>();
    public void addAnimalInEnd(String animal){
        this.collection.addLast(animal);
    }

    public void deleteAnimalFromStart(){
        this.collection.remove(0);
    }

    public void getCollection() {
        for (String animals: this.collection) {
            System.out.print(animals+", ");
        }
    }
}
