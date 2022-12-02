package IvanovVadimHW16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User implements Cloneable {
    static private int id;
    private String name;
    private String birthDay;
    private int individualId;

    public User(String name) {
        this.name = name;
        this.individualId = User.id++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay() {

      /*  Scanner scanner = new Scanner(System.in);
        String date = "";
        Pattern pattern = Pattern.compile("(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\.((0[1-9])|(1[0-2]))\\.[1-2][0-9][0-9][0-9]");

        boolean flag = true;

        while (flag) {
            date = scanner.nextLine();
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                flag = false;*/
        int day = (int) ((Math.random() * (31 - 1 + 1) + 1));
        int month = (int) ((Math.random() * (12 - 1 + 1) + 1));
        int year = (int) ((Math.random() * (2100 - 1970 + 1) + 1970)); // генерирует года с 1970 по 2100
        String date = day + "." + month + "." + year;
        String[] numFromDateLine = date.split("\\.");
        int dayFromBirthday = Integer.parseInt(numFromDateLine[0]);
        int monthFromBirthday = Integer.parseInt(numFromDateLine[1]);
        int yearFromBirthday = Integer.parseInt(numFromDateLine[2]);
        LocalDate localDate = LocalDate.of(yearFromBirthday, monthFromBirthday, dayFromBirthday);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        this.birthDay = dateTimeFormatter.format(localDate);
            /*} else {
                System.out.println("Не верный формат даты рождения. Попробуйте снова...");
            }*/
    }

    @Override
    public String toString() {
        return "Ползователь " +
                "c id: " + id +
                ", именем: " + name +
                ", дата рождения: " + birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return individualId == user.individualId && Objects.equals(name, user.name) && Objects.equals(birthDay, user.birthDay);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return 17 * 31 * birthDay.hashCode() * name.hashCode();
    }

}