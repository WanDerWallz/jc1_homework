package part8.task33;

public class BathroomAppliances extends HouseholdAppliances{
    private int waterUsage;
    public BathroomAppliances(String brand, String model, String color, int waterUsage) {
        super(brand, model, color);
        this.waterUsage = waterUsage;
    }

    public int getWaterUsage() {
        return waterUsage;
    }

    public void setWaterUsage(int type) {
        this.waterUsage = waterUsage;
    }
}
