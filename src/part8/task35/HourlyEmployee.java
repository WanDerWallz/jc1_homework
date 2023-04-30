package part8.task35;

public class HourlyEmployee extends Employee {
    protected double hoursADay;
    protected int daysAMonth;

    public HourlyEmployee(String name, String surname, String occupation) {
        super(name, surname, occupation);
    }

    public double getHourRate() {
        return hourRate;
    }

    public double getHoursADay() {
        return hoursADay;
    }

    public int getDaysAMonth() {
        return daysAMonth;
    }

    public void setHoursADay(double hoursADay) {
        this.hoursADay = hoursADay;
    }

    public void setDaysAMonth(int daysAMonth) {
        this.daysAMonth = daysAMonth;
    }

    public double getSalary(double hoursADay, int daysAMonth) {
        if (hoursADay > 10 || hoursADay < 0 || daysAMonth < 0 || daysAMonth > 31) {
            System.out.println("Неправильно введены данные.");
        } else {
            System.out.println(hourRate * hoursADay * daysAMonth);
        }
        return 0;
    }
}
