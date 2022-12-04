package IvanovVadimHW16;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("Вадим");
        user.setBirthDay();
        System.out.println("Отработка метода toString:");
        System.out.println(user);
        System.out.println("Отработка метода hashCod: " + user.hashCode());
        User userClone = (User) user.clone();
        System.out.println("Отработка метода toString для клона:");
        System.out.println(userClone);
        System.out.println("Результат сравнения клонированного и начального объекта:");
        System.out.println(user.equals(userClone));
        System.out.println("Замена имени в клоне для теста: ");
        userClone.setName("Валера");
        System.out.println(userClone);
        System.out.println("Отработка метода hashCod для клона: " + userClone.hashCode());
        System.out.println("Результат сравнения изменённого клонируемого объекта и начального объекта");
        System.out.println(user.equals(userClone));
    }
}
