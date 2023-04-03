package lesson8;

public class Test {
    public static void main(String[] args) {
        ImmutableMan man = new ImmutableMan("Vasia",
                100,
                new MutableAddress("Minsk", "Lenina 1"));
        System.out.println(man.getName() + " "
                + man.getHairLength() + " "
                + man.getAddress());
        man.getAddress().setCity("Leningrad");
        man.getAddress().setStreet("Levina 13");
        System.out.println(man.getName() + " "
                + man.getHairLength() + " "
                + man.getAddress());
    }
}
