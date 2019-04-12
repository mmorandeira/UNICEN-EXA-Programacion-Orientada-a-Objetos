package moran.practico2.ejercicio1;

import java.time.Month;
import java.time.LocalDate;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person p1 = new Person(27002972, "Roberto", "Cigueñal", LocalDate.of(1971, Month.DECEMBER, 23));
        p1.setWeight(89f);
        p1.setHeight(1.8f);
        System.out.println(p1.toString());
    }
}