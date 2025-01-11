package es.ulpgc.dis;

import java.time.LocalDate;

public class Person {
    private static final int DAYS_OF_YEAR = 365;
    private final String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                '}';
    }



    private final LocalDate birthday;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    public int toYears(long days) {
        return (int) (days/DAYS_OF_YEAR);
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
