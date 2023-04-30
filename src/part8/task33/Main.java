package part8.task33;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("BOSCH","X123","Blue",15, 50);
        washingMachine.plugIn();
        washingMachine.wash(12);
        washingMachine.unplug();
        BathroomAppliances jacuzzi = new BathroomAppliances("Intex","Pure Spa Jet & Bubble Deluxe 28462","Gray",5);
        jacuzzi.unplug();
    }
}
