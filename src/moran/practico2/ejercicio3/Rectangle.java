package moran.practico2.ejercicio3;

public class Rectangle {
    private Point topLeft, topRight, botLeft, botRight;

    public Rectangle(Point topLeft, Point topRight, Point botLeft, Point botRight) {
        // Los copio para que no me afecte el rectagunlo desde afuera. Esta bien asi?
        // supongo que me pasan bien el rectangulo
        // sino la otra es crear un por default y si los que pasan son los que van, lo creo??
        this.topLeft=new Point (topLeft);
        this.topRight=new Point (topRight);
        this.botLeft=new Point (botLeft);
        this.botRight=new Point (botRight);
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

    public double getBase(){//supongo que es el metodo que pide del largo del lado superior(como arriba)
        return botLeft.getDistance(botRight);
    }

    public double getHeight(){
        return topLeft.getDistance(botLeft);
    }

    public boolean invert(Point vertice){
        //esto es lo que decia el enunciado? o lo inteprete mal
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
            topRight=new Point(vertice.getX(),vertice.getY()+base);
            botLeft=new Point(vertice.getX(),vertice.getY()-height);
            botRight=new Point(vertice.getX()+base,vertice.getY()-height);
            return true;
        }
        return false;
    }

    public boolean isStanding(){
        return this.getHeight()>this.getBase();
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
        return topLeft + ", " + topRight + ", " + botLeft + ", " + botRight;
    }
}
