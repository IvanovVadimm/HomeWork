package IvanovVadimHW8;

import java.util.Random;

public abstract class Hen {

    private static int countEggsInYear;

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "I am a chicken";
    }

    public void sumEggs(int hensEggsInYear) {
        if (hensEggsInYear >= 0) {
            countEggsInYear = countEggsInYear + hensEggsInYear;
        }
    }

    public static void getEggsInYear() {
        System.out.println("All of Hens give " + countEggsInYear+" eggs");
    }
}
