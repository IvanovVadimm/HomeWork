import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class IvanovVadimHW2_2 {
    public static void main(String[] args) {

        /**     Task #1     **/

        System.out.println("Task #1");
        System.out.println("Sequence of odd numbers from 1 to 99: ");

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        /**     Task #2     **/

        System.out.println("Task #2");
        System.out.println("Sequence of numbers from 5 to 1: ");

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        /**     Task #3     **/

        System.out.println("Task #3");
        System.out.println("Sum of numbers from 1 to entered number: ");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
        System.out.println();

        /**     Task #4     **/

        System.out.println("Task #4");
        System.out.println("Sequence of numbers of form 7, 14, 21, 28 ... 98: ");

        num = 7;

        while (num <= 98) {
            System.out.print(num + " ");
            num = num + 7;
        }

        System.out.println();
        System.out.println();

        /**     Task #5     **/

        System.out.println("Task #5");
        System.out.println("Sequence of first tenth numbers of form 0, -5, -10, -15 ... ");

        num = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num = num - 5;
        }

    }
}
