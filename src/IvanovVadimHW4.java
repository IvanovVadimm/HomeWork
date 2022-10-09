import java.util.Arrays;
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

        int[][] arrayFromGeneralTask = new int[3][3];


        System.out.println("The 2D 3x3 array: ");

        for (int i = 0; i < arrayFromGeneralTask.length; i++) {
            for (int j = 0; j < arrayFromGeneralTask[i].length; j++) {
                arrayFromGeneralTask[i][j] = random.nextInt(15);
                System.out.print(arrayFromGeneralTask[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number which each array's numbers are increment: ");
        int customerNum = scanner.nextInt();
        System.out.println();

        System.out.println("The 2D array 3x3, each array's numbers incremented for " + customerNum + " ");

        int sum = 0;

        for (int i = 0; i < arrayFromGeneralTask.length; i++) {
            for (int j = 0; j < arrayFromGeneralTask[i].length; j++) {
                arrayFromGeneralTask[i][j] = arrayFromGeneralTask[i][j] + customerNum;
                System.out.print(arrayFromGeneralTask[i][j] + " ");
                sum = sum + arrayFromGeneralTask[i][j];
            }
            System.out.println();
        }
        System.out.println("Number's sum from the array: " + sum);
        System.out.println();


        /**     Additional Task     **/
        // Вывести шахматную доску


        int[][] arrayFromAdditionalTask = new int[8][8];

        String whiteCell = "W";
        String blackCell = "B";

        System.out.println("The Chess table: ");

        for (int i = 0; i < arrayFromAdditionalTask.length; i++) {
            for (int j = 0; j < arrayFromAdditionalTask[i].length; j++) {
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
        System.out.println();

        //Первое задание из телеги

        /*На вход поступает массив разных чисел из N элементов в диапазоне [0,N],
        Вернуть единственное число в диапазоне, которое отсутствует в массиве.*/

        int[] arrayFromFirstTelegramTask = {0, 1, 3, 4};

        Arrays.sort(arrayFromFirstTelegramTask);

        for (int i = 0; i <= arrayFromFirstTelegramTask.length; i++) {
            int indexNum = Arrays.binarySearch(arrayFromFirstTelegramTask, i);

            if (indexNum < 0) {
                System.out.println("Missed num from the array " + Arrays.toString(arrayFromFirstTelegramTask) + " is " + i);
            }
        }


        // Второе задание из телеги

        /*1.Пользователь должен ввести с клавиатуры размер массива - натуральное число болше 3.
        Введённое пользователем число сохраняеся в переменную n.
        2. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        3. Создать массив из n случайных чисел из отрезка [0,n] и вывести его на экран.
        4. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран
        */


        System.out.println("Enter the dimension of the array - a natural number greater than 3: ");

        int n;

        do {
            n = scanner.nextInt();
            if (n > 3) {
                break;
            } else {
                System.out.println("Retype: ");
            }
        } while (true);

        int[] arrayFromSecondTelegramTask = new int[n];

        System.out.println("The Array3 of random numbers: ");

        for (int i = 0; i < arrayFromSecondTelegramTask.length; i++) {
            arrayFromSecondTelegramTask[i] = random.nextInt(n);
            System.out.print(arrayFromSecondTelegramTask[i] + " ");
        }
        System.out.println();

        int sumEvenNum = 0; // считает количество чётных чисел в массиве

        for (int num : arrayFromSecondTelegramTask) {
            if (num % 2 == 0) {
                sumEvenNum++;
            }
        }

        int[] arrayCopyFromArraySecondTelegramTask = new int[sumEvenNum];

        sumEvenNum = 0;

        if (arrayCopyFromArraySecondTelegramTask.length == 0) {
            System.out.println("Array arrayCopy is empty. There isn't even numbers in array.");
        } else {
            for (int i = 0; i < arrayFromSecondTelegramTask.length; i++) {

                if (arrayFromSecondTelegramTask[i] % 2 == 0) {
                    arrayCopyFromArraySecondTelegramTask[sumEvenNum] = arrayFromSecondTelegramTask[i];
                    sumEvenNum++;

                }
            }

            System.out.println("Array of  even numbers from array3: ");
            for (int num : arrayCopyFromArraySecondTelegramTask) {
                System.out.print(num + " ");
            }
        }
    }
}

