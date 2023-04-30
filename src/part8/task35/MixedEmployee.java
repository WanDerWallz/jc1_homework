package part8.task35;

public class MixedEmployee extends HourlyEmployee {
    private double percentage;

    public MixedEmployee(String name, String surname, String occupation) {
        super(name, surname, occupation);
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getSalary(double hoursADay, int daysAMonth, double percentage) {
        if (percentage > 100 || percentage < 0 || hoursADay > 10 || hoursADay < 0 || daysAMonth < 0 || daysAMonth > 31) {
            System.out.println("Неправильно введены данные.");
        } else {
            System.out.println((percentage / 100) * baseSalary + hourRate * hoursADay * daysAMonth);
        }
        return 0;
    }
}
