package IvanovVadimHW13;

import javax.naming.BinaryRefAddr;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTaskClass_2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Текущая дата: " + localDate);

        for (int i = 0; ; i++) {
            if (i == 0) {
                if (localDate.getDayOfWeek() == DayOfWeek.TUESDAY) {
                    System.out.println("Дата следующего вторника " + localDate.plusDays(7));
                    break;
                }
            }

            if() {
                localDate.plusDays(1)
                        //TODO прповерка каждого дня на то что это вторник чи не
            }
            localDate = localDate.plusDays(1);
        }
    }
}
