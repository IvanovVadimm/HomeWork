package IvanovVadimHW7;

public class Tiger extends Animal implements CanEat {


    public Tiger() {
    }

    public Tiger(double weight, int age) {
        super(weight, age);
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }
}
