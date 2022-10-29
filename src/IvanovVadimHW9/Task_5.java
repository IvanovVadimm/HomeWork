package IvanovVadimHW9;

import java.util.Scanner;

public class Task_5 {
    /*
    Ввести 3 строки с консоли. Среди слов состоящих только из цифр, найти слово палидром
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int longArray = 3;

        String[] strings = new String[longArray];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (String string : strings) {
            int validateNum = 0;
            char[] chars = string.toCharArray();
            for (int i = 1; i <= chars.length / 2; i++) {
                if (chars[i - 1] == chars[chars.length - i]) {
                    validateNum++;
                }
            }
            if (validateNum == (string.length()) / 2) {
                System.out.println(string);
            }
        }
    }
}
