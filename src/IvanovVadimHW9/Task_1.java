package IvanovVadimHW9;

import java.util.Scanner;

public class Task_1 {


    /*
    Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumStrings = 3;

        String[] stringsArray = new String[sumStrings];

        for (int i = 0; i < stringsArray.length; i++) {
            String string = scanner.nextLine();
            stringsArray[i] = string;
        }

        int min = stringsArray[0].length();
        int max = stringsArray[0].length();

        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].length() <= min) {
                min = stringsArray[i].length();
            }
        }

        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].length() >= max) {
                max = stringsArray[i].length();
            }
        }

        for (String string : stringsArray) {
            if (string.length() == min) {
                System.out.println("The shortest string: " + string);
            }
            if (string.length() == max) {
                System.out.println("The longest string: " + string);
            }
        }

    }
}
