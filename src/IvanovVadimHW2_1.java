import java.util.Scanner;

public class IvanovVadimHW2_1 {
    public static void main(String[] args) {

        /**     Task #1     **/

        System.out.println("Task #1");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of month: ");
        int numMonth = sc.nextInt();

        switch (numMonth) {
            case 12:
                System.out.println(numMonth + "th of month is Winter");
                break;
            case 1:
                System.out.println(numMonth + "st of month is Winter");
                break;
            case 2:
                System.out.println(numMonth + "nd of month is Winter");
                break;
            case 3:
                System.out.println(numMonth + "rd of month is Spring");
                break;
            case 4:
            case 5:
                System.out.println(numMonth + "th of month is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(numMonth + "th of month is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(numMonth + "th of month is Autumn");
                break;
            default:
                System.out.println("There isn't such month");
        }

        System.out.println();

        /**     Task #2     **/

        System.out.println("Task #2");

        System.out.print("Enter number of month: ");
        numMonth = sc.nextInt();

        if ((numMonth == 12) || (numMonth == 1) || (numMonth == 2)) {
            System.out.println("It's winter");
        } else if ((numMonth == 3) || (numMonth == 4) || (numMonth == 5)) {
            System.out.println("It's Spring");
        } else if ((numMonth == 6) || (numMonth == 7) || (numMonth == 8)) {
            System.out.println("It's Summer");
        } else if ((numMonth == 9) || (numMonth == 10) || (numMonth == 11)) {
            System.out.println("It's Autumn");
        } else System.out.println("There isn't such month");

        System.out.println();

        /**     Task #3     **/

        System.out.println("Task #3");

        System.out.print("Enter checked number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("This one is even number");
        }
        if (num % 2 != 0) {
            System.out.println("This one isn't even number");
        }

        System.out.println();

        /**     Task #4     **/

        System.out.println("Task #4");

        System.out.print("Enter checked degrees: ");
        int outsideDegrees = sc.nextInt();

        if (outsideDegrees > -5) {
            System.out.println("It's warm");
        } else if ((outsideDegrees <= -5) && (outsideDegrees > -20)) {
            System.out.println("It's normal");
        } else if (outsideDegrees < -20) {
            System.out.println("It's cold");
        }

        System.out.println();
    }
}
