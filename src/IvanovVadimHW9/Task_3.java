package IvanovVadimHW9;

import java.util.Scanner;

public class Task_3 {
    /*
    Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthArray = 3;

        long averageLengthStrings;
        double bufferValue = 0.0;

        String[] strings = new String[lengthArray];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (String string : strings) {
            bufferValue = bufferValue + string.length();
        }
        averageLengthStrings = Math.round(bufferValue / lengthArray);

        System.out.println("Average length of strings " + averageLengthStrings);

        for (String string : strings) {
            if ((string.length() < averageLengthStrings)) {
                System.out.println("The String with string's length which fewer than the average length of strings " + string+ " and its length is "+string.length());
            }
        }
    }
}
