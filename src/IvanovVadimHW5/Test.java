package IvanovVadimHW5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        CreditCard card_1 = new CreditCard("BY20 OLMP 3135 1211 1242 6123 0933",300.14);
        CreditCard card_2 = new CreditCard("BY20 ASDD 6788 1456 1234 1212 2342",0.14);
        CreditCard card_3 = new CreditCard("BY20 FGFS 4564 1278 1886 9853 8664",134.15);

        card_1.putDownSumOnAccount(10);
        card_2.putDownSumOnAccount(15.3);
        card_3.takeOffSumFromAccount(12.14234123142);

        card_1.showCardInformation();
        card_2.showCardInformation();
        card_3.showCardInformation();
    }
}
