package moran.practico2.ejercicio3;

public class Point {
    private double x,y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public Point(){
        this.x=0d;
        this.y=0d;
    }

    public void move(double x, double y){
        this.x+=x;
        this.y+=y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x=x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y=y;
    }

    public double getDistance(Point p2){//this point is p1 (distance)^2=(p1.x-p2.x)^2+(p1.y-p2.y)^2
        return Math.sqrt(Math.pow((this.x-p2.getX()),(2f))+Math.pow((this.y-p2.getY()),(2f)));
    }


}