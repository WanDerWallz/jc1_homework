package part9.task39;

public class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String name, boolean hasSidecar) {
        super(name);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }
}
