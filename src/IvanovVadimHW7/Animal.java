package IvanovVadimHW7;

public abstract class Animal {
    private double weight;
    private int age;

    public Animal() {
    }

    public Animal(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
