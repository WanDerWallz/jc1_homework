package part8.task33;

public class WashingMachine extends BathroomAppliances{
    private int capacity;
    public WashingMachine(String brand, String model, String color,int waterUsage, int capacity) {
        super(brand, model, color,waterUsage);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void wash(int kg) {
        if (kg > capacity) {
            System.out.println("Превышена вместимость стиральной машины.");
        } else {
            System.out.println("Стиральная машина стирает " + kg + " кг белья.");
        }
    }
}
