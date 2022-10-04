import java.util.Arrays;
import java.util.Scanner;

public class IvanovVadimHW3 {
    public static void main(String[] args) {
        // Массивы

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array dimension: ");

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }


        /**     Task #1      **/
        /* Пройти по массиву, вывести всве элементы в прямом и в обратном порядке */

        System.out.println("Task #1");

        System.out.println("Array output: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Reversing output an array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println();


        /**     Task #2      **/
        /* Найти минимальный-максимальный элементы и вывести */

        System.out.println("Task #2");

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println("Minimum number from array " + min + ", maximum number from array " + max);

        System.out.println();


        /**     Task #3      **/
        /*Найти индес минимального и максимального элементов и вывести*/

        System.out.println("Task #3");

        System.out.println("Current array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.print("Index ( indices ) of the minimum number(-s) from the array: ");

        for (int i = 0; i < array.length; i++) {
            if (min == array[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Index ( indices ) of the maximum number(-s) from the array: ");

        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println();


        /**     Task #4     **/
        /*Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет*/

        System.out.println("Task #4");

        int sumZeroNumbers = 0;

        for (
                int number : array) {
            if (number == 0) {
                sumZeroNumbers++;
            }
        }
        if (sumZeroNumbers == 0) {
            System.out.println("There isn't zero numbers!");
        } else {
            System.out.println("Sum zero numbers in the array: " + sumZeroNumbers);
        }

        System.out.println();


        /**     Task #5     **/
        /*Пройти по массиву и поменять местами первый и последний, второй и предпослдений и т.д.*/

        System.out.println("Task #5");

        int saveArraysValueContain = 0; // переменная хранит данные из ячейки массива

        for (int i = 0; i < array.length / 2; i++) {

            saveArraysValueContain = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = saveArraysValueContain;

        }

        System.out.print("The Array whose elements are swapped: ");

        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println();


        /**     Task #6     **/
        /*Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего)*/

        System.out.println("Task #6");

        int checkNum = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                checkNum++;
            }
        }

        if (checkNum == array.length - 1) {
            System.out.println("The Array is increase sequence");
        } else {
            System.out.println("The Array isn't increase sequence");
        }
    }
}



