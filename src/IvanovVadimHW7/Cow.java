package IvanovVadimHW7;

public class Cow extends Animal implements CanEat {

    public Cow() {
    }

    public Cow(double weight, int age) {
        super(weight, age);
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating");
    }
}
