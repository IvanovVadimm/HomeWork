package IvanovVadimHW10;

public class MySecondException extends Exception{
    private String name;
    public MySecondException(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Что-то сломалось второй раз "+name;
    }
}
