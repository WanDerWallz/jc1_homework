package part8.task34;

public class PlatinumCreditCard extends CreditCard{
    private double cashback;

    public PlatinumCreditCard(String cardNumber, String nameHolder, String expirationDate, int cvv, int creditLimit, double cashback) {
        super(cardNumber, nameHolder, expirationDate, cvv, creditLimit);
        this.cashback = cashback;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }
}
