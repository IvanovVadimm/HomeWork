package IvanovVadimHW13;

import java.util.function.Consumer;

/*
Используя Consumer реализовать лямбду, которая будет принимать в себя строку в формате "сумма BYN"
(через пробел), а выводить сумму переведенную сразу в доллары.
*/
public class LambdaTaskClass_8 {
    public static void main(String[] args) {
        Consumer<String> lambda8 = (stringValue) -> {
            int spaceIndex = stringValue.indexOf(" ");
            stringValue = stringValue.substring(0, spaceIndex);
            double currentValueOfstringValue = Double.parseDouble(stringValue);
            double dollarExchangeRate = 2.56;
            System.out.println(currentValueOfstringValue * dollarExchangeRate);
        };
        System.out.print("Сумма в долларах: ");
        lambda8.accept("78.26 BYN");
    }
}
