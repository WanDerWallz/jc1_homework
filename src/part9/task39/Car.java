package part9.task39;

public class Car extends Vehicle {
    private final int productionYear;

    public Car(String name, int productionYear) {
        super(name);
        this.productionYear = productionYear;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
