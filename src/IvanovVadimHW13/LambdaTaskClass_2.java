package IvanovVadimHW13;

import java.util.function.Consumer;
/*
Написать лямбдо выражение, которое принимает на вход объект типа Box и выводит на консоль сообщение
"Отгрузили ящик с весом n" где n - поле в классе, которое содержит вес ящика.
 */
public class LambdaTaskClass_2 {
    public static void main(String[] args) {
        Box box = new Box(12);
        Consumer<Box> lambda = (x) -> {
            System.out.println("Отгрузили ящик весом " + x.getWeight() + " кг");
        };
        lambda.accept(box);
    }
}
