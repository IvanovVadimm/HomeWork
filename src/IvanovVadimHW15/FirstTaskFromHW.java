package IvanovVadimHW15;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstTaskFromHW {
    public static void main(String[] args) {
        /*
        Написать программу для проверки на валидность введённого ip адреса.
        Пусть IP адрес задаётся с консоли. Программа должна проверять валидность
        введённого IP адреса с помощью регулярного выражения и выводить результат проверки на экран.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ip: ");

        String ipAddress = scanner.nextLine();

        Pattern pattern = Pattern.compile("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}");

        Matcher matcher = pattern.matcher(ipAddress);

        System.out.println(!(matcher.matches()) ? "IP isn't correct" : "Entering IP is: " + ipAddress);
    }
}
