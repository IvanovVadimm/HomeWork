package IvanovVadimHW8;

import java.util.Random;

import static IvanovVadimHW8.UkrainianHen.getEggsInYear;

public class Main {
    public static void main(String[] args) {

        chickenGeneration();

    }

    public static void chickenGeneration() {
        Random random = new Random();

        int countIteration = 100;

        for (int i = 0; i < countIteration; i++) {
            int randomNum = random.nextInt(4);
            switch (randomNum) {
                case 0:
                    new RussianHen();
                    break;
                case 1:
                    new UkrainianHen();
                    break;
                case 2:
                    new MoldovianHean();
                    break;
                case 3:
                    new BelarussianHen();
                    break;
            }
        }

        Hen.getEggsInYear();

    }
}
