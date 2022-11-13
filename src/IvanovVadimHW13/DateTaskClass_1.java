package IvanovVadimHW13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTaskClass_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        LocalDate localDate = LocalDate.of(year, month, day);

        String dateTimeLocal = localDate.format(formatter);

        System.out.println("Полная введённая дата: "+dateTimeLocal);

        System.out.println("День недели " + localDate.getDayOfWeek());
    }
}
