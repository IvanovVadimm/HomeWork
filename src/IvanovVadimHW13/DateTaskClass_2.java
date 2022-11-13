package IvanovVadimHW13;

import javax.naming.BinaryRefAddr;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*
Написать программу для вывода на экран дату следующего вторника
 */
public class DateTaskClass_2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMM yyyy");

        System.out.println("Текущая дата: " + localDate.format(dateTimeFormatter));

        for (int i = 0; ; i++) {
            if (i == 0) {
                if (localDate.getDayOfWeek() == DayOfWeek.TUESDAY) {
                    System.out.println("Дата следующего вторника " + localDate.plusDays(7));
                    break;
                }
            }
            if ((localDate.getDayOfWeek() == DayOfWeek.TUESDAY)) {
                System.out.println("Дата следующего вторника: "+localDate.format(dateTimeFormatter));
                break;
            } else {
                localDate = localDate.plusDays(1);
            }
        }
    }
}
