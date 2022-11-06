package IvanovVadimHW11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vadim\\OneDrive\\Рабочий стол\\TMS\\HomeWork\\src\\IvanovVadimHW11\\romeo-and-juliet.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vadim\\OneDrive\\Рабочий стол\\TMS\\HomeWork\\src\\IvanovVadimHW11\\longStringFromRomeo-and-Juliet.txt")) {

            int i = -1;

            StringBuilder stringBuilder = new StringBuilder();

            while ((i = fileInputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }

            String string = new String(stringBuilder);
            string.replace(".", "");
            string.replace(",", "");
            string.replace("[", "");
            string.replace("]", "");

            String[] wordsInString = string.split("\n");

            String max = "";
            String maxOfText = "";


            for (String wordssInString : wordsInString) {
                String[] stringFromWordsString = wordssInString.split(" ");

                max = stringFromWordsString[0];
                for (i = 0; i < stringFromWordsString.length; i++) {
                    if (stringFromWordsString[i].startsWith("=")) {
                        continue;
                    }
                    if (max.length() <= stringFromWordsString[i].length()) {
                        max = stringFromWordsString[i];
                        if (maxOfText.length() < max.length()) {
                            maxOfText = max;
                        }
                    }
                }
            }
            byte[] buffer = maxOfText.getBytes();

            fileOutputStream.write(buffer);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}