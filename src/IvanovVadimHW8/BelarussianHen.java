package IvanovVadimHW8;

public class BelarussianHen extends Hen {

    private final static int EGGS_IN_MONTH = 10;
    private final String country = "Belarus";

    public BelarussianHen() {
        System.out.println(this.getDescription());
        sumEggs(EGGS_IN_MONTH);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return EGGS_IN_MONTH;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", I am from " + this.country + ", I give you " + EGGS_IN_MONTH + " eggs in month";
    }

}
