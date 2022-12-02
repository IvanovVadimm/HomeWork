package IvanovVadimHW16;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Вадим");
        user.setBirthDay();
        System.out.println("Отработка метода toString:");
        System.out.println(user);
        System.out.println("Отработка метода hashCod: "+ user.hashCode());
        User userClone = (User) user.clone();
        System.out.println("Результат сравнения клонированного и начального объекта:");
        System.out.println(user.equals(userClone));
        userClone.setName("Валера");
        System.out.println("Результат сравнения изменённого клонируемого объекта и начального объекта");
        System.out.println(user.equals(userClone));
    }
}
