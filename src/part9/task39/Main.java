package part9.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите название машины: ");
        String carName = scanner.nextLine();
        System.out.println("Введите год производства автомобиля: ");
        int carProductionYear = scanner.nextInt();
        Garage<Car> carGarage = new Garage<>();
        carGarage.setVehicle(new Car(carName, carProductionYear));

        System.out.println("Введите название моцикла: ");
        String motorcycleName = scanner1.nextLine(); //Если использовать объект scanner, не даёт ввести эту строку (следующий boolean можно).
        System.out.println("Есть ли у мотоцикла коляска (true/false)?");
        boolean motorcycleHasSidecar = scanner.nextBoolean();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();
        motorcycleGarage.setVehicle(new Motorcycle(motorcycleName, motorcycleHasSidecar));

        System.out.println("Машина в гараже - " + carGarage.getVehicle().getName() + ".");
        System.out.println("Мотоцикл в гараже - " + motorcycleGarage.getVehicle().getName() + ".");
    }
}
