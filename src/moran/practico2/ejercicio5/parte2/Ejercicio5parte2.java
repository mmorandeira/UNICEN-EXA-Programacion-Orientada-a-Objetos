package moran.practico2.ejercicio5.parte2;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Ejercicio5parte2 {
    public static void main(String[] args) {
        Contact cabeza = new Contact("Ismael", "Aguiar", "Saavedra 92", "Balcarce", "cabeza@gmail.com",
                LocalDate.of(1994, Month.AUGUST, 6), 2266482865l);
        Contact juan = new Contact("Juan Pablo", "Correa", "A la vuelta de la barrial", "Villa aguirre", "juancorrea@alumnos.exa.unicen.edu.ar",
                LocalDate.of(1994, Month.AUGUST, 6), 2494529051l);
        Contact gian = new Contact("Gian", "Grecco", "al lado del macro", "Tandil", "giangrecco@alumnos.exa.unicen.edu.ar",
                LocalDate.of(1994, Month.AUGUST, 6), 2494529051l);
        Contact ale = new Contact("Ismael", "Aguiar", "Saavedra 92", "Balcarce", "cabeza@gmail.com",
                LocalDate.of(1994, Month.AUGUST, 6), 2266482865l);
        Contact pela = new Contact("Eliel Arturo", "Catauro", "barrio mirage", "Tandil", "pela3@alumnos.exa.unicen.edu.ar",
                LocalDate.of(1994, Month.AUGUST, 6), 2494529051l);
        Contact laucha = new Contact("Lautaro", "Rockefeller", "batidepto", "Tandil", "lauchaman@alumnos.exa.unicen.edu.ar",
                LocalDate.of(1994, Month.AUGUST, 6), 2494529051l);
        Cellphone oneplus3t = new Cellphone();
        oneplus3t.addContact(cabeza);
        oneplus3t.addContact(juan);
        oneplus3t.addContact(gian);
        oneplus3t.addContact(ale);
        oneplus3t.addContact(pela);
        oneplus3t.addContact(laucha);
        oneplus3t.addContact(laucha);
        if (ale.equals(cabeza))
            System.out.println("son iguales");
        else
            System.out.println("SON DISTNTOS");
        List<Contact> repeated = oneplus3t.findDuplicates();
        System.out.println(repeated.size());
        for (Contact c : repeated) {
            System.out.println(c);
        }
    }
}
