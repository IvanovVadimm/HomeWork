package IvanovVadimHW8;

public class MoldovianHean extends Hen {

    private final static int EGGS_IN_MONTH = 7;
    private final String country = "Moldova";

    public MoldovianHean() {
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
