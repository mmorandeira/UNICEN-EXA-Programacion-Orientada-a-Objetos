package moran.practico4.ejercicio3;

public class DistancePol extends Politic {

    private double maxDistance;

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    public DistancePol(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public boolean acepted(Order order) {
        return order.getDistance() < maxDistance;
    }
}
