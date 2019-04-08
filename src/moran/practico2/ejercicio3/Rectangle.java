package moran.practico2.ejercicio3;

public class Rectangle {
    private Point topLeft, topRight, botLeft, botRight;

    public Rectangle(Point topLeft, Point topRight, Point botLeft, Point botRight) {
        this.topLeft=topLeft;
        this.topRight=topRight;
        this.botLeft=botLeft;
        this.botRight=botRight;
    }

    public void move(Double x, Double y) {
        topLeft.move(x,y);
        topRight.move(x,y);
        botLeft.move(x,y);
        botRight.move(x,y);
    }

    public double getArea() {
        return this.getBase()*this.getHeight();
    }

    public boolean isSquare() {
        return this.getBase()==this.getHeight();
    }

    private double getBase(){
        return botLeft.getDistance(botRight);
    }

    private double getHeight(){
        return topLeft.getDistance(botLeft);
    }

}
