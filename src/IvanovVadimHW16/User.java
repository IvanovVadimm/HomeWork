package IvanovVadimHW16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class User implements Cloneable {
    static private int id;
    private String name;
    private String birthDay;
    private int individualId;

    public User(String name) {
        this.name = name;
        this.individualId = ++User.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay() {
        int dayFromBirthday = (int) ((Math.random() * (31 - 1 + 1) + 1));
        int monthFromBirthday = (int) ((Math.random() * (12 - 1 + 1) + 1));
        int yearFromBirthday = (int) ((Math.random() * (2100 - 1970 + 1) + 1970)); // генерирует года с 1970 по 2100
        LocalDate localDate = LocalDate.of(yearFromBirthday, monthFromBirthday, dayFromBirthday);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        this.birthDay = dateTimeFormatter.format(localDate);
    }

    @Override
    public String toString() {
        return "Ползователь " +
                "c id: " + individualId +
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