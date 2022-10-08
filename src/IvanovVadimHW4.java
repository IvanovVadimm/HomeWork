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

        int[][] array = new int[3][3];


        System.out.println("The 2D 3x3 array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(15);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number which each array's numbers are increment: ");
        int customerNum = scanner.nextInt();
        System.out.println();

        System.out.println("The 2D array 3x3, each array's numbers incremented for " + customerNum + " ");

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + customerNum;
                System.out.print(array[i][j] + " ");
                sum = sum + array[i][j];
            }
            System.out.println();
        }
        System.out.println("Number's sum from the array: " + sum);
        System.out.println();


        /**     Additional Task     **/
        // Вывести шахматную доску


        int[][] array1 = new int[8][8];

        char whiteCell = 'W';
        char blackCell = 'B';

        System.out.println("The Chess table: ");

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

        //Первое задание из телеги

        /*На вход поступает массив разных чисел из N элементов в диапазоне [0,N],
        Вернуть единственное число в диапазоне, которое отсутствует в массиве.*/

        //Костыль, как мне кажется, но работает)) Наверное, можно лучше реализовать.

        int[] array5 = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("The source array: ");

        for (int num : array5) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(array5);

        System.out.println("Missed number from ascending sequence of array's numbers: ");

        for (int i = 0; i < array5.length - 1; i++) {
            if(array5.length == 2){
                System.out.println(array5[i+1]+1);
                break;
            }
            if (array5[i + 1] - array5[i] != 1) {
                System.out.println(array5[i] + 1);
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

        int[] array3 = new int[n];

        System.out.println("The Array3 of random numbers: ");

        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(n);
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        int sumEvenNum = 0; // считает количество чётных чисел в массиве

        for (int num : array3) {
            if (num % 2 == 0) {
                sumEvenNum++;
            }
        }

        int[] array3Copy = new int[sumEvenNum];

        sumEvenNum = 0;

        if (array3Copy.length == 0) {
            System.out.println("Array array3Copy is empty. Even numbers isn't in array3.");
        } else {
            for (int i = 0; i < array3.length; i++) {

                if (array3[i] % 2 == 0) {
                    array3Copy[sumEvenNum] = array3[i];
                    sumEvenNum++;

                }
            }

            System.out.println("Array of  even numbers from array3: ");
            for (int num : array3Copy) {
                System.out.print(num + " ");
            }
        }
    }
}

