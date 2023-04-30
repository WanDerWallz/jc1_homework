package part8.task34;

public class BankCard {
    private String cardNumber;
    private String nameHolder;
    private String expirationDate;
    private int cvv;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public BankCard(String cardNumber, String nameHolder, String expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.nameHolder = nameHolder;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
}
