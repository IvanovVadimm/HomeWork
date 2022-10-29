package IvanovVadimHW9;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {

    /*
    Ввести 3 строки с консоли. Найти слово состоящее только из различных символов. Если таких слов несколько,
    найти первое из них
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthArray = 3;

        String[] strings = new String[lengthArray];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (String string : strings) {
            int validateNum = 0;
            char[] chars = string.toCharArray();
            for (char firstChar : chars) {
                for (char secondChar : chars) {
                    if (firstChar != secondChar) {
                        System.out.println(string);
                        validateNum++;
                        break;
                    }
                }
                break;
            }
            if (validateNum == 1) {
                break;
            }
        }
    }
}
