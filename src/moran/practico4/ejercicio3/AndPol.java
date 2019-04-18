package moran.practico4.ejercicio3;

public class AndPol extends Politic {

    private Politic p1, p2;

    public AndPol(Politic p1, Politic p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Politic getP1() {
        return p1;
    }

    public void setP1(Politic p1) {
        this.p1 = p1;
    }

    public Politic getP2() {
        return p2;
    }

    public void setP2(Politic p2) {
        this.p2 = p2;
    }

    @Override
    public boolean acepted(Order order) {
        return p1.acepted(order) && p2.acepted(order);
    }
}
