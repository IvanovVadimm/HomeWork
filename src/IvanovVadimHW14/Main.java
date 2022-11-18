package IvanovVadimHW14;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, StringBuilder> idNameMap = new TreeMap<>();

        idNameMap.put(1, new StringBuilder("Валера1"));
        idNameMap.put(2, new StringBuilder("Валера2"));
        idNameMap.put(3, new StringBuilder("Валера3"));
        idNameMap.put(4, new StringBuilder("Валера4"));
        idNameMap.put(5, new StringBuilder("Валера5"));
        idNameMap.put(6, null);
        idNameMap.put(7, new StringBuilder("Валера7"));
        idNameMap.put(8, new StringBuilder("Валера8"));
        idNameMap.put(9, new StringBuilder("Валера9"));
        idNameMap.put(10, new StringBuilder("Валера10"));
        idNameMap.put(11, new StringBuilder("Валера11"));
        idNameMap.put(12, new StringBuilder("Валера12"));
        idNameMap.put(13, new StringBuilder("Валера13"));
        idNameMap.put(14, new StringBuilder("Валера14"));

        Optional<TreeMap<Integer, StringBuilder>> optionalTreeMap = Optional.ofNullable(idNameMap);

        ArrayList<StringBuilder> listOfRightNames = new ArrayList<>();

        for (int i = 0; i < idNameMap.size(); i++) {
            Optional<StringBuilder> optionalOfName = Optional.ofNullable(idNameMap.get(i));
            if (optionalOfName.isPresent()) {
                if ((i == 1) || (i == 2) || (i == 5) || (i == 8) || (i == 9) || (i == 13)) {
                    optionalOfName.filter(x -> x.length() % 2 != 0);
                    listOfRightNames.add(optionalOfName.get());
                }
            } else {
                System.out.println("There is null value at " + i + " index");
            }
        }
        listOfRightNames.stream().map(StringBuilder::reverse).forEach(System.out::println);
    }
}