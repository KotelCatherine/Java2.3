package ru.geekbrains.java2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    static Map<String, Set<Integer>> phoneNumberAndSurname = new HashMap<>();

    public static void add(String surname, Integer number) {
        if (phoneNumberAndSurname.containsKey(surname)) {
            Set<Integer> numbers = phoneNumberAndSurname.get(surname);
            numbers.add(number);
        } else {
            Set<Integer> numbers = new HashSet<>();
            numbers.add(number);
            phoneNumberAndSurname.put(surname, numbers);
        }
    }

    public static Set<Integer> get(String value) {
        return phoneNumberAndSurname.get(value);
    }
}
