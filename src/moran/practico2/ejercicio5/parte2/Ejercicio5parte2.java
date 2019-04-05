package moran.practico2.ejercicio5.parte2;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio5parte2 {
    public static void main(String[] args) {
        Contact cabeza=new Contact("Ismael","Aguiar","Saavedra 92","Balcarce","cabeza@gmail.com",
                LocalDate.of(1994, Month.AUGUST,6),2266482865l);
        Contact juan=new Contact("Juan Pablo","Correa","A la vuelta de la barrial","Villa aguirre","juancorrea@alumnos.exa.unicen.edu.ar",
                LocalDate.of(1994, Month.AUGUST,6),2494529051l);
        System.out.println(cabeza);
        System.out.println(juan);
    }
}
