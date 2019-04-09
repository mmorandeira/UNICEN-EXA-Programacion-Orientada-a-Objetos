package moran.practico2.ejercicio6;

import moran.practico2.ejercicio3.Point;
import moran.practico2.ejercicio6.Rectangle;

public class Ejercicio6 {
    public static void main(String[] args) {
        Point v0=new Point(7,6);
        Point v1=new Point(14,6);
        Point v2=new Point(7,3);
        Point v3=new Point(14,3);
        Rectangle r1=new Rectangle(v0,7,3);
        v0.move(0,1);// esto deveria poder hacerce?, los creo denuevo en el constructor?
        System.out.println(r1);
        System.out.println(r1.getArea());
        r1.invert(v2);
        System.out.println(r1);
        System.out.println(r1.getArea());
    }
}