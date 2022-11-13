package IvanovVadimHW13;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*
Написать лямбда выражение, которое возвращает случайное число от 0 до 10
 */
public class LambdaTaskClass_4 {
    public static void main(String[] args) {
        Supplier<Double> lambda4 = () -> {
            Random random = new Random();
            return random.nextDouble() * 10;
        };

        System.out.println(lambda4.get());
    }
}
