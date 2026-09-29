package es.ulpgc.dis;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person pancho = new Person("Pancho", LocalDate.of(2003, 11, 25));
        System.out.println(pancho);
    }
}
