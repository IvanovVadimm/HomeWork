package IvanovVadimHW14;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> idNameMap = new TreeMap<>();

        idNameMap.put(1, "Валера1");
        idNameMap.put(2, "Валера2");
        idNameMap.put(3, "Валера3");
        idNameMap.put(4, "Валера4");
        idNameMap.put(5, "Валера5");
        idNameMap.put(6, "Валера6");
        idNameMap.put(7, "Валера7");
        idNameMap.put(8, "Валера8");
        idNameMap.put(9, "Валера9");
        idNameMap.put(10, "Валера10");
        idNameMap.put(11, "Валера11");
        idNameMap.put(12, "Валера12");
        idNameMap.put(13, "Валера13");
        idNameMap.put(14, "Валера14");

        Optional<TreeMap<Integer, String>> optionalTreeMap = Optional.ofNullable(idNameMap);

        LinkedList<String> listOfRightNames = new LinkedList<>();

        for (int i = 0; i < idNameMap.size(); i++) {
            Optional<String> optionalOfName = Optional.ofNullable(idNameMap.get(i));
            optionalOfName.orElse("There is null value at " + i + " index");
            if (optionalOfName.isPresent()) {
                if ((i == 1) || (i == 2) || (i == 5) || (i == 8) || (i == 9) || (i == 13)) {
                    optionalOfName.filter(x -> x.length() % 2 != 0);
                    listOfRightNames.add(optionalOfName.get());
                }
            }
        }

        Optional<LinkedList> optionalLinkedList = Optional.ofNullable(listOfRightNames);

        if (!(optionalLinkedList.isPresent())) {
            System.out.println("List of names is empty");
        }

        ArrayList<String> listEnd = new ArrayList<>();

        for (String string : listOfRightNames) {
            StringBuilder reverseString = new StringBuilder(string).reverse();
            listEnd.add(String.valueOf(reverseString));
        }
        for (String strings : listEnd) {
            System.out.println(strings + " ");
        }
    }
}