package part6.task26;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.addMoneyNom20(3);
        atm.addMoneyNom50(1);
        atm.addMoneyNom100(2);
        atm.showMoney();
        atm.withdrawMoney(250);
        atm.withdrawMoney(-60);
        atm.showMoney();
    }
}
