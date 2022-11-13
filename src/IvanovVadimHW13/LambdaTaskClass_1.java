package IvanovVadimHW13;

import java.util.function.Function;
import java.util.function.Predicate;
/*
Написать программу , которая проверяет, что строка начинается буквой "J" или "N" и заканчивается "A".
 */
public class LambdaTaskClass_1 {
    public static void main(String[] args) {
        Predicate<String> lambda1 = (x) -> {
            if (((x.startsWith("J") || x.startsWith("N")) && x.endsWith("A"))) {
                return true;
            }
            return false;
        };

        System.out.println(lambda1.test("JA"));
        System.out.println(lambda1.test("asd"));
    }
}