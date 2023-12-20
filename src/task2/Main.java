package task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Shirin", 556744570);
        contacts.put("Aizhan", 702090637);
        contacts.put("Amir", 502097636);
        contacts.put("Ayana", 779153625);
        contacts.put("Alina", 552622553);

        for (Map.Entry<String , Integer> i: contacts.entrySet()) {
            System.out.println(i.getKey() + ", phone number: " + i.getValue());
        }
        System.out.println("\nNames: " + contacts.keySet());
        System.out.println("Phone number: " + contacts.values());
    }
}
