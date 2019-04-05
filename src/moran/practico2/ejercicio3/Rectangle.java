package moran.practico2.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {
    private List<Point> vertices;

    public Rectangle(Point v1,Point v2, Point v3,Point v4){
        vertices=new ArrayList<Point>();
        vertices.add(0,v1);
        vertices.add(1,v2);
        vertices.add(2,v3);
        vertices.add(3,v4);
    }

    public void move(Double x, Double y){
        for(Point vertice:vertices){
            vertice.move(x,y);
        }
    }

    public double getArea(){
        Double side1=vertices.get(0).getDistance(vertices.get(1));
        Double side2=vertices.get(2).getDistance(vertices.get(3));
        return side1*side2;
    }

    public Point getVertice(Integer vertice){
        if(vertice>=0 && vertice<4)
            return vertices.get(vertice);
        else
            return null;
    }

    public boolean isSquare(){
        Double side1=vertices.get(0).getDistance(vertices.get(1));
        Double side2=vertices.get(2).getDistance(vertices.get(3));
        return side1==side2;
    }


}
