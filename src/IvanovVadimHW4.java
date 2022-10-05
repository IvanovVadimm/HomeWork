import java.util.Random;
import java.util.Scanner;

public class IvanovVadimHW4 {
    public static void main(String[] args) {

        /**     General Task    **/

        /*Создать двумерный массив, заполнить его числами. Добавить к каждому значению число,
        которое пользователь будет вводить с консоли. Найти сумму всех получившихся элементов.
        */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] array = new int[3][3];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int customerNum = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + customerNum;
                System.out.print(array[i][j] + " ");
                sum = sum + array[i][j];
            }
            System.out.println();
        }
        System.out.println("Number's sum from array: " + sum);
        System.out.println();


        /**     Additional Task     **/


        int[][] array1 = new int[8][8];

        char whiteCell = 'W';
        char blackCell = 'B';

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (i % 2 == 0) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(whiteCell + " ");
                    } else {
                        System.out.print(blackCell + " ");
                    }
                } else {
                    if ((i + j) % 2 == 0) {
                        System.out.print(whiteCell + " ");
                    } else {
                        System.out.print(blackCell + " ");
                    }
                }
            }
            System.out.println();
        }

    }
}
