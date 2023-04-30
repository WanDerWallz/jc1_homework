package part8.task34;

public class CreditCard extends BankCard{
    private int creditLimit;

    public CreditCard(String cardNumber, String nameHolder, String expirationDate, int cvv, int creditLimit) {
        super(cardNumber, nameHolder, expirationDate, cvv);
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int limit) {
        this.creditLimit = limit;
    }
}
