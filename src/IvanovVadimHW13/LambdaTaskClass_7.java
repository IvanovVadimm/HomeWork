package IvanovVadimHW13;

import java.util.function.Function;

/*
Используя Function реализовать лямбду, которая будет принимать в себя строку в формате "сумма BYN"
(через пробел), а выводить сумму переведенную сразу в доллары.
*/
public class LambdaTaskClass_7 {
    public static void main(String[] args) {
        Function<String, Double> lambda7 = (stringValue) -> {
            int spaceIndex = stringValue.indexOf(" ");
            stringValue = stringValue.substring(0, spaceIndex);
            double currentValueOfStringValue = Double.parseDouble(stringValue);
            double dollarExchangeRate = 2.56;
            return currentValueOfStringValue * dollarExchangeRate;
        };
        System.out.println("Сумма в долларах: " + lambda7.apply("24.45 BYN"));
    }
}
