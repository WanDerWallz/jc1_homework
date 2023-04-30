package part8.task35;

public class PercentageEmployee extends Employee {
    private double percentage;

    public PercentageEmployee(String name, String surname, String occupation) {
        super(name, surname, occupation);
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getSalary(double percentage) {
        if (percentage > 100 || percentage < 0) {
            System.out.println("Неправильно введены данные.");
        } else {
            System.out.println((percentage / 100) * baseSalary);
        }
        return 0;
    }
}
