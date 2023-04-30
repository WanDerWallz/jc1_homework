package part8.task33;

public class HouseholdAppliances implements VRozetke {
    private String brand;
    private String model;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void plugIn() {
        System.out.println("Техника " + brand + " " + model + " включена в розетку.");
    }

    @Override
    public void unplug() {
        System.out.println("Техника " + brand + " " + model + " выключена из розетки.");
    }

    public HouseholdAppliances(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
}
