package IvanovVadimHW12;

public class Main {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();
        animalCollection.addAnimalInEnd("Cat","Dog","Whale","Tiger");

        animalCollection.getCollection();
        animalCollection.deleteAnimalFromStart();
        System.out.println();
        animalCollection.getCollection();
        animalCollection.deleteAnimalFromStart();
    }
}
