package ru.geekbrains.java2;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Homework3Ex2 {
    public static void main(String[] args) {
        Phonebook.add("Пооль", 23233);
        Phonebook.add("Ульянов", 51688);
        Phonebook.add("Соколов", 22151);
        Phonebook.add("Пооль", 51921);
        Phonebook.add("Пономарева", 51688);
        Phonebook.add("Ульянов", 21318);
        Phonebook.add("Ульянов", 21258);

        Set<String> surnames = Phonebook.phoneNumberAndSurname.keySet();

        for (String surname : surnames) {
            System.out.println(surname + Phonebook.get(surname));
        }
    }
}
