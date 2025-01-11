package es.ulpgc.dis;

import java.time.LocalDate;

public class Person {
    private static final int DAYS_OF_YEAR = 365;

    public String getNombre() {
        return nombre;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person(String nombre, LocalDate birthday) {
        this.nombre = nombre;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", birthday=" + birthday +
                ", age=" + GetAge() +
                '}';
    }

    public int GetAge() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long days){
        return (int) (days/DAYS_OF_YEAR);
    }

    private final String nombre;
    private final LocalDate birthday;
}
