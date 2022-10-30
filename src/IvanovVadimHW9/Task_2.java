package IvanovVadimHW9;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    /*
    Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longArray = 3;

        String[] strings = new String[longArray];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        String firstStringWithSmallWidth = strings[0];
        String bufferString;
        for (int i = 0; i < strings.length; i++) {
            for (int k = 0; k < strings.length - 1; k++) {
                if ((Math.min(strings[k].length(), strings[k + 1].length())) == strings[k + 1].length()) {
                    bufferString = strings[k];
                    strings[k] = strings[k + 1];
                    strings[k + 1] = bufferString;
                }
            }
        }

        for (String string : strings
        ) {
            System.out.println(string + " ");

        }
    }
}
