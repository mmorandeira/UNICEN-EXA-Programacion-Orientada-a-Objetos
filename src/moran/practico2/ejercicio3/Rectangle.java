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
        topLeft=new Point(x,y);
        topRight=new Point(x,y);
        botLeft=new Point(x,y);
        botRight=new Point(x,y);
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

    public boolean invert(Point vertice){
        double base=getBase();
        double height=getHeight();
        if(topLeft.equals(vertice)){
            
            topLeft=new Point(vertice.getX()-base,vertice.getY()+height);
            topRight=new Point(vertice.getX(),vertice.getY()+height);
            botLeft=new Point(vertice.getX()-base,vertice.getY());
            botRight=new Point(vertice.getX(),vertice.getY());
            return true;
        }else if(topRight.equals(vertice)){
            topLeft=new Point(vertice.getX(),vertice.getY()+height);
            topRight=new Point(vertice.getX()+base,vertice.getY()+height);
            botLeft=new Point(vertice.getX(),vertice.getY());
            botRight=new Point(vertice.getX()+base,vertice.getY());
            return true;
        }else if(botLeft.equals(vertice)){
            topLeft=new Point(vertice.getX()-base,vertice.getY());
            topRight=new Point(vertice.getX(),vertice.getY());
            botLeft=new Point(vertice.getX()-base,vertice.getY()-height);
            botRight=new Point(vertice.getX(),vertice.getY()-height);
            return true;
        }else if(botRight.equals(vertice)){
            topLeft=new Point(vertice.getX(),vertice.getY());
            topRight=new Point(vertice.getX(),vertice.getY());
            botLeft=new Point(vertice.getX(),vertice.getY());
            botRight=new Point(vertice.getX(),vertice.getY());
            return true;
        }
        return false;
    }
}
