package IvanovVadimHW14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, StringBuilder> idNameMap = new TreeMap<>();

        idNameMap.put(1, new StringBuilder("Vadim1"));
        idNameMap.put(2, new StringBuilder("Vadim2"));
        idNameMap.put(3, new StringBuilder("Vadim3"));
        idNameMap.put(4, new StringBuilder("Vadim4"));
        idNameMap.put(5, new StringBuilder("Vadim5"));
        idNameMap.put(6, null);
        idNameMap.put(7, new StringBuilder("Vadim7"));
        idNameMap.put(8, new StringBuilder("Vadim8"));
        idNameMap.put(9, new StringBuilder("Vadim9"));
        idNameMap.put(10, new StringBuilder("Vadim10"));
        idNameMap.put(11, new StringBuilder("Vadim11"));
        idNameMap.put(12, new StringBuilder("Vadim12"));
        idNameMap.put(13, new StringBuilder("Vadim13"));
        idNameMap.put(14, new StringBuilder("Vadim14"));

        Optional<TreeMap<Integer, StringBuilder>> optionalTreeMap = Optional.ofNullable(idNameMap);

        ArrayList<StringBuilder> listOfRightNames = new ArrayList<>();

        int a = 1;
        int b = 2;
        int c = 5;
        int d = 8;
        int e = 9;
        int f = 13;

        for (int i = 0; i < idNameMap.size(); i++) {
            Optional<StringBuilder> optionalOfName = Optional.ofNullable(idNameMap.get(i));
            if (optionalOfName.isPresent()) {
                if ((i == a) || (i == b) || (i == c) || (i == d) || (i == e) || (i == f)) {
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