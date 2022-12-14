package IvanovVadimHW11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vadim\\OneDrive\\Рабочий стол\\TMS\\HomeWork\\src\\IvanovVadimHW11\\romeo-and-juliet.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\vadim\\OneDrive\\Рабочий стол\\TMS\\HomeWork\\src\\IvanovVadimHW11\\longStringFromRomeo-and-Juliet.txt");)
             {

            int i = -1;

            StringBuilder stringBuilder = new StringBuilder();

            while ((i = fileInputStream.read()) != -1) {
                stringBuilder.append((char) i);
            }

            String currentString = String.valueOf(stringBuilder);
            currentString = currentString.replace(".", "");
            currentString = currentString.replace(",", "");
            currentString = currentString.replace("[", "");
            currentString = currentString.replace("]", "");
            currentString = currentString.replace(":", "");

            String[] wordsInString = currentString.split("\n");

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

            byte[] bytes = maxOfText.getBytes();

            fileOutputStream.write(bytes);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}