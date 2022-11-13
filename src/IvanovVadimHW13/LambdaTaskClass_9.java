package IvanovVadimHW13;

import java.util.Scanner;
import java.util.function.Supplier;

/*
Используя Supplier написать метод, который будет возвращать введенную с консоли строку задом наперед.
*/
public class LambdaTaskClass_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier<StringBuilder> lambda9 = () -> {
            String stringValue = scanner.nextLine();
            StringBuilder stringBuilder = new StringBuilder(stringValue);
            return stringBuilder.reverse();
        };
        System.out.println(lambda9.get());
    }
}
