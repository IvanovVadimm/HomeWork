package IvanovVadimHW10;

public class MyFirstException extends Exception{
    private String name;
    public MyFirstException(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Что-то сломалось "+name;
    }
}
