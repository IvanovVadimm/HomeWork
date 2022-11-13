package IvanovVadimHW13;

import java.util.function.Predicate;

/*
Используя Predicate среди массива чисел вывести только те, которые являются положительными.
 */
public class LambdaTaskClass_5 {
    public static void main(String[] args) {
        Predicate<Integer> lambda5 = (x) -> {
            if (x > 0) {
                return true;
            }
            return false;
        };

        int[] array1 = {-1, 2, -4, 6};
        System.out.println("Положительные числа из массива: ");
        for (int i = 0; i < array1.length; i++) {
            if (lambda5.test(array1[i])) {
                System.out.print(array1[i] + " ");
            }
        }
    }
}
