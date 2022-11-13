package IvanovVadimHW13;

import java.util.function.Consumer;

/* Написать лямбда выражение, которое принимает на вход число и возвращает значение
"Положительное число", "Отрицательное число", "Ноль"
*/
public class LambdaTaskClass_3 {
    public static void main(String[] args) {
        Consumer<Integer> lambda3 = (x) -> {
            if (x > 0) {
                System.out.println("Положительное число");
            }
            if (x < 0) {
                System.out.println("Отрицательное число");
            }
            if (x == 0) {
                System.out.println("Ноль");
            }
        };

        lambda3.accept(3);
        lambda3.accept(-4);
        lambda3.accept(0);
    }
}
