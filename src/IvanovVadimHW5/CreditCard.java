package IvanovVadimHW5;

public class CreditCard {

    String iban; // номер счёта
    double amountOnAccount; // текущая сумма на счёте

    public CreditCard() {
    }

    public CreditCard(String iban, double bankAccount) {
        this.iban = iban;
        this.amountOnAccount = bankAccount;
    }

    void putDownSumOnAccount(double sum) {
        this.amountOnAccount = this.amountOnAccount + sum;
    }

    void takeOffSumFromAccount(double sum) {
        this.amountOnAccount = this.amountOnAccount - sum;
    }

    void showCardInformation() {
        System.out.println("Card with IBAN: " + this.iban + " has " + String.format("%.2f", this.amountOnAccount) + " $ on her bank account");
    }

}

