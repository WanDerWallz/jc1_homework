package part8.task35;

public abstract class Employee {
    private String name;
    private String surname;
    private String occupation;
    final int baseSalary = 1100; //оклад
    final double hourRate = 5; //почасовая оплата

    public double getHourRate() {
        return hourRate;
    }

    public Employee(String name, String occupation, String surname) {
        this.name = name;
        this.occupation = occupation;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
