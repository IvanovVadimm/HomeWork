package IvanovVadimHW10;

import java.util.Scanner;

public class SomeThingClass {

    public static void generateException(String name) throws MyFirstException {
        throw new MyFirstException(name);
    }

    public static void generateException2(String name) throws MySecondException {
        throw new MySecondException(name);
    }

    public static void oneMethod() {
        try {
            generateException("в методе oneMethod генерация первого исключения");
        } catch (MyFirstException e) {
            System.out.println(e);
        }
    }

    public static void secondMethod() {
        try {
            generateException2("в методе secondMethod генерация второго исключения");
            generateException("в методе secondMethod генерация первого исключения");
        } catch (MyFirstException | MySecondException k) {
            System.out.println(k);
        }
    }

    public static void thirdMethod() {
        try {
            generateException("В методе thirdMethod генерация первого исключения");
            generateException2("В методе thirdMethod генерация второго исключения");
        } catch (MyFirstException e1) {
            System.out.println(e1);
        } catch (MySecondException e2) {
            System.out.println(e2);
        }
    }

    public static void fourthMethod() {
        try {
            generateException("в методе fourthMethod генерация первого исключения");
        } catch (MyFirstException e) {
            System.out.println(e);
        } finally {
            System.out.println("Отработал блок finally"); // Чтобы не отрабатывал можно в try или catch вызвать бесконечный цикл)))
        }
    }


}
