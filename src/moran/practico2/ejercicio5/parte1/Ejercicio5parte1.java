package moran.practico2.ejercicio5.parte1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Ejercicio5parte1 {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Person p1 = new Person(40020042, "Matias", "Morandeira", LocalDate.of(1997, Month.MARCH, 16));
        p1.setSex("M");
        p1.setMail("Morandeiramatias@gmail.com");
        System.out.println(p1.getAge());
        LocalTime start1, end1;
        start1 = LocalTime.of(16, 30);
        end1 = LocalTime.of(17, 30);
        Meeting m1 = new Meeting("metodologia", LocalDate.of(2019, Month.APRIL, 1), start1, end1);
        Meeting m2 = new Meeting("POO", LocalDate.of(2019, Month.APRIL, 1), LocalTime.of(17, 31), LocalTime.of(18, 0));
        Schedule sch1 = new Schedule();
        System.out.println(sch1.addMeeeting(m1));
        System.out.println(sch1.addMeeeting(m2));
        Meeting m3 = sch1.getMeeting(LocalDate.of(2019, Month.APRIL, 1), LocalTime.of(17, 31));
        if (m3 == null)
            System.out.println("m3 es null");
        else
            System.out.println("m3 NO es null");
        if (m3.checkOverlap(m1))
            System.out.println("the meetings overlap");
        else
            System.out.println("the meetings donn't overlap");
        System.out.print(start1);
    }
}
