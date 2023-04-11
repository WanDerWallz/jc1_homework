package part6.task26;

public class ATM {
    private int quantityNom20;
    private int quantityNom50;
    private int quantityNom100;

    public ATM() {
        quantityNom20 = 0;
        quantityNom50 = 0;
        quantityNom100 = 0;
    }

    public int addMoneyNom20(int quantity) {
        if (quantity < 0) {
            System.out.println("Невозможно добавить такую сумму денег.");
            System.exit(1);
        }
        quantityNom20 += quantity;
        return quantityNom20;
    }

    public int addMoneyNom50(int quantity) {
        if (quantity < 0) {
            System.out.println("Невозможно добавить такую сумму денег.");
            System.exit(1);
        }
        quantityNom50 += quantity;
        return quantityNom50;
    }

    public int addMoneyNom100(int quantity) {
        if (quantity < 0) {
            System.out.println("Невозможно добавить такую сумму денег.");
            System.exit(1);
        }
        quantityNom100 += quantity;
        return quantityNom100;
    }

    public int withdrawMoney(int money) {
        boolean operationIsSuccess;
        if (money > quantityNom20 * 20 + quantityNom50 * 50 + quantityNom100 * 100 || money < 20 || (money >= 20 && money < 50 && money % 20 != 0) || (money >= 50 && (money % 10 != 0 || money % 100 == 10 || money % 100 == 30)) || (money < 0)) {
            operationIsSuccess = false;
            System.out.println(operationIsSuccess + " - операция не удалась.");
            System.out.println("");
        } else if (money <= quantityNom20 * 20 + quantityNom50 * 50 + quantityNom100 * 100) {
            int a = money / 100;
            if ((money % 100 < 50) || (money % 100 >= 50 && (money % 100) % 20 == 0)) {
                int c = (money % 100) / 20;
                if (quantityNom20 - c < 0 || quantityNom50 < 0 || quantityNom100 - a < 0) {
                    operationIsSuccess = false;
                    System.out.println(operationIsSuccess + " - операция не удалась.");
                    System.out.println("");
                } else {
                    quantityNom100 -= a;
                    quantityNom20 -= c;
                    operationIsSuccess = true;
                    System.out.println(operationIsSuccess + " - операция удалась.");
                    System.out.println("Было выдано: ");
                    System.out.println("Купюр номинала 100: " + a + ".");
                    System.out.println("Купюр номинала 50: 0.");
                    System.out.println("Купюр номинала 20: " + c + ".");
                    System.out.println("");
                }
            } else if (money % 100 > 50 && (money % 100) % 20 != 0) {
                int b = (money % 100) / 50;
                int c = ((money % 100) % 50) / 20;
                if (quantityNom20 - c < 0 || quantityNom50 - b < 0 || quantityNom100 - a < 0) {
                    operationIsSuccess = false;
                    System.out.println(operationIsSuccess + " - операция не удалась.");
                    System.out.println("");
                } else {
                    quantityNom100 -= a;
                    quantityNom50 -= b;
                    quantityNom20 -= c;
                    operationIsSuccess = true;
                    System.out.println(operationIsSuccess + " - операция удалась.");
                    System.out.println("Было выдано: ");
                    System.out.println("Купюр номинала 100: " + a + ".");
                    System.out.println("Купюр номинала 50: " + b + ".");
                    System.out.println("Купюр номинала 20: " + c + ".");
                    System.out.println("");
                }
            } else if (money % 100 == 50) {
                int b = (money % 100) / 50;
                if (quantityNom20 < 0 || quantityNom50 - b < 0 || quantityNom100 - a < 0) {
                    operationIsSuccess = false;
                    System.out.println(operationIsSuccess + " - операция не удалась.");
                    System.out.println("");
                } else {
                    quantityNom100 -= a;
                    quantityNom50 -= b;
                    operationIsSuccess = true;
                    System.out.println(operationIsSuccess + " - операция удалась.");
                    System.out.println("Было выдано: ");
                    System.out.println("Купюр номинала 100: " + a + ".");
                    System.out.println("Купюр номинала 50: " + b + ".");
                    System.out.println("Купюр номинала 20: 0.");
                    System.out.println("");
                }
            }
        }
        return 0;
    }

    public int showMoney() {
        System.out.println(quantityNom100 * 100 + quantityNom50 * 50 + quantityNom20 * 20);
        System.out.println("");
        return 0;
    }
}