package part8.task34;

public class DebitCard extends BankCard{
    private double balance;

    public DebitCard(String cardNumber, String nameHolder, String expirationDate, int cvv, double balance) {
        super(cardNumber, nameHolder, expirationDate, cvv);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
