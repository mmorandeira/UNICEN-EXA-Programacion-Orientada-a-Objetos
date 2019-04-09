package moran.practico2.ejercicio6;

import moran.practico2.ejercicio3.Point;

public class Rectangle {
    private Point topLeft;
    private double base,height;

    public Rectangle(Point topLeft, double base, double height) {
        this.topLeft=new Point (topLeft);
        this.base=base;
        this.height=height;
    }

    public void move(Double x, Double y) {
        topLeft.move(x,y);
    }

    public double getBase(){
        return Math.abs(this.base);
    }

    public double getHeight(){
        return Math.abs(this.height);
    }

    public double getArea() {
        return getBase()*getHeight();
    }

    public boolean isSquare() {
        return getBase()==getHeight();
    }

    public boolean invert(Point vertice){
        //esto es lo que decia el enunciado? o lo inteprete mal
        /*if(topLeft.equals(vertice)){
            topLeft=new Point(vertice.getX()-base,vertice.getY()+height);
            return true;
        }else if(topRight.equals(vertice)){
            topLeft=new Point(vertice.getX(),vertice.getY()+height);
            return true;
        }else if(botLeft.equals(vertice)){
            topLeft=new Point(vertice.getX()-base,vertice.getY());
            return true;
        }else if(botRight.equals(vertice)){
            topLeft=new Point(vertice.getX(),vertice.getY());
            return true;
        }*/
        return false;
    }

    public boolean isStanding(){
        return getHeight()>getBase();
    }

    public int compare(Rectangle rectangle){
        if(this.getArea()>rectangle.getArea())
            return 1;
        if(this.getArea()==rectangle.getArea())
            return 0;
        return -1;
    }

    @Override
    public String toString(){
        return topLeft + ", " + base + ", " + height;
    }
}
