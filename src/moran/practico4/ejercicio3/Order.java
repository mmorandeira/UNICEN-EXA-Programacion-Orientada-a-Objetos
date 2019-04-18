package moran.practico4.ejercicio3;

import java.time.LocalDate;

public class Order {
    private String furniture, material;
    private double distance, cost;//uso distancia en ves de lugar, supongo que alguien calcula la distancia de afuera
    private LocalDate maxDate;

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(LocalDate maxDate) {
        this.maxDate = maxDate;
    }

    public Order(String furniture, String material, double distance, double cost, LocalDate maxDate) {
        this.furniture = furniture;
        this.material = material;
        this.distance = distance;
        this.cost = cost;
        this.maxDate = maxDate;
    }

}
