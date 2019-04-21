package moran.practico4.ejercicio3;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio3 {
    public static void main(String[] args) {
        Order o01 = new Order("Escritorio", "Pino", 2d, 100d, LocalDate.of(2019, Month.JULY, 31));
        Order o02 = new Order("Comoda", "Roble", 2.3d, 150d, LocalDate.of(2019, Month.MARCH, 15));
        Order o03 = new Order("Mesa de luz", "Algarrobo", 1.5d, 200d, LocalDate.of(2019, Month.MAY, 22));
        Order o04 = new Order("Escritorio", "Melamina", 0.89d, 3050.25d, LocalDate.of(2019, Month.MAY, 21));
        Order o05 = new Order("Sillon", "Algarrobo", 0.1d, 3600.12d, LocalDate.of(2019, Month.MAY, 14));
        Order o06 = new Order("Cama", "Pino", 3.5d, 1756d, LocalDate.of(2019, Month.JUNE, 7));
        Order o07 = new Order("Puerta", "Cedro", 5d, 10000d, LocalDate.of(2019, Month.MAY, 8));
        Order o08 = new Order("Alacena", "Abeto", 3d, 1767d, LocalDate.of(2019, Month.MAY, 10));
        Order o09 = new Order("Banquito", "Fresno", 0.75d, 9654.55d, LocalDate.of(2019, Month.APRIL, 30));
        Order o10 = new Order("Mesa", "Caoba", 4.25d, 9512.56d, LocalDate.of(2019, Month.APRIL, 29));
        System.out.println(o01);
        System.out.println(o02);
        System.out.println(o03);
        System.out.println(o04);
        System.out.println(o05);
        System.out.println(o06);
        System.out.println(o07);
        System.out.println(o08);
        System.out.println(o09);
        System.out.println(o10);

    }
}
