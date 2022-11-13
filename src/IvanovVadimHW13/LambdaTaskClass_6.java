package IvanovVadimHW13;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/*
Используя Binary/Unary возвести в квадрат массив чисел.
 */
public class LambdaTaskClass_6 {
    public static void main(String[] args) {
        UnaryOperator<int[]> lambda6 = (array) -> {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * array[i];
            }
            return array;
        };

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        System.out.println("После возведения каждого элемента массива в квадрат");
        System.out.println(Arrays.toString(lambda6.apply(array)));
    }
}
