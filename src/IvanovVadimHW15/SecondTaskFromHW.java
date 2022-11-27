package IvanovVadimHW15;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTaskFromHW {
    public static void main(String[] args) throws FileNotFoundException, IIOException {
        /*
        Программа на вход получает путь к файлу формата txt. Формат содержит произвольный текст.
        В этом тексте может быть номер документа (один или несколько), эмейл и номер телефона.
        Номер документа в формате: хххх-хххх-х, где х - это любая цифра; номер телефона в формате
        +(ХХ)ХХХХХХХ. Документ может содержать не всю информацию, т.е. например, может не содержать номер телефона
        , или другое. Необходимо извлечь информацию.
        Извлечённую информацию необходимо сохранить в следёющую структуру данных: Map, где ключ типа String - это что сохраняем
        (email, document number, phone number), значение типа String с информацией. В конце вывести все найденные элементы Map.
        */
        StringBuilder informationFromFile = new StringBuilder("");

        try (FileReader fileReader = new FileReader("C:\\Users\\vadim\\OneDrive\\Рабочий стол\\TMS\\HomeWork\\src\\IvanovVadimHW15\\Information.txt")) {
            informationFromFile = new StringBuilder("");
            int i = -1;
            while ((i = fileReader.read()) != -1) {
                informationFromFile.append((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Pattern patternOfPhoneNumbersInformation = Pattern.compile("\\+\\([0-9]{2}\\)[0-9]{7}");
        Matcher matcherOfPhoneNumbersInformation = patternOfPhoneNumbersInformation.matcher(informationFromFile);

        Pattern patternOfDocumentsNameInformation = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}");
        Matcher matcherOfDocumentsNameInformation = patternOfDocumentsNameInformation.matcher(informationFromFile);

        Pattern patternOfEmailInformation = Pattern.compile("[A-z]+\\.?[A-z]+@[a-z]{4,}\\.(com|ru)");
        Matcher matcherOfEmailInformation = patternOfEmailInformation.matcher(informationFromFile);

        String phoneNumberFromFile = "";
        String emailFromFile = "";
        String documentNumberFromFile = "";
        String fieldInformationIsEmpty = "Нет данных";

        if (matcherOfPhoneNumbersInformation.find()) {
            phoneNumberFromFile = matcherOfPhoneNumbersInformation.group();
        } else {
            phoneNumberFromFile = fieldInformationIsEmpty;
        }

        if (!matcherOfDocumentsNameInformation.matches()) {
            documentNumberFromFile = fieldInformationIsEmpty;
        }
        int sumOfMatches = 0;
        while (matcherOfDocumentsNameInformation.find()) {
            if (sumOfMatches == 0) {
                documentNumberFromFile = matcherOfDocumentsNameInformation.group();
            }
            sumOfMatches++;
            if (sumOfMatches > 1) {
                documentNumberFromFile = documentNumberFromFile + ", " + matcherOfDocumentsNameInformation.group();
            }
        }

        if (matcherOfEmailInformation.find()) {
            emailFromFile = matcherOfEmailInformation.group();
        } else {
            emailFromFile = fieldInformationIsEmpty;
        }

        LinkedHashMap<String, String> informationMap = new LinkedHashMap<>();
        informationMap.put("email: ", emailFromFile);
        informationMap.put("documents number: ", documentNumberFromFile);
        informationMap.put("phone number: ", phoneNumberFromFile);

        informationMap.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}