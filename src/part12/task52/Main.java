package part12.task52;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        int personCount = 10;
        List<Person> persons = new ArrayList<>();

        String[] names = {"Александр", "Юрий", "Владимир", "Глеб", "Павел", "Андрей", "Вадим", "Артём"};
        String[] surnames = {"Иванов", "Петров", "Сидоров", "Смирнов", "Кузнецов", "Стрельцов","Герасимов", "Буренков"};
        Random random = new Random();
        for (int i = 0; i < personCount; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            int age = random.nextInt(100);
            Person person = new Person(name, surname, age);
            persons.add(person);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("people.txt"))) {
            for (Person person : persons) {
                writer.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
