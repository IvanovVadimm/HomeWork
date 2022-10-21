package IvanovVadimHW8;

public class UkrainianHen extends Hen {

    private final static int EGGS_IN_MONTH = 5;
    private final String country = "Ukraine";

    public UkrainianHen(){
        System.out.println(this.getDescription());
        sumEggs(EGGS_IN_MONTH);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return EGGS_IN_MONTH;
    }

    public String getDescription() {
        return super.getDescription() + ", I am from " + this.country + ", I give you " + EGGS_IN_MONTH + " eggs in month";
    }
}
