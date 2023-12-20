package task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Car, Integer> cars = new HashMap<>();
        cars.put(new Car("Toyota Camry"), 2017);
        cars.put(new Car("Lexus LX 600"), 2021);
        cars.put(new Car("Hyundai Sonata"), 2020);

        for (Map.Entry<Car, Integer> i: cars.entrySet()) {
            System.out.println(i.getKey() + ", " + i.getValue());
        }

        System.out.println("\nKeys: " + cars.keySet());
        System.out.println("Values: " + cars.values());

    }
}