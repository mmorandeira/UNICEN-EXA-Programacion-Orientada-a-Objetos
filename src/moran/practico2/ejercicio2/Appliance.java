package moran.practico2.ejercicio2;

public class Appliance {
    private String name, color = "gris plata";
    private Float basePrice = 100f, consumption = 10f, weight = 2f;

    private final Float lowConsumption = 45f;//consumption below this value are consider low consumption
    private final Float highEnd = 3f;//balance over this values are consider highend

    public Appliance(String name) {
        this.setName(name);
    }

    public Appliance(String name, String color) {
        this.setName(name);
        this.setColor(color);
    }

    public Appliance(String name, String color, Float basePrice) {
        this.setName(name);
        this.setColor(color);
        this.setBasePrice(basePrice);
    }

    public Appliance(String name, String color, Float basePrice, Float consumption) {
        this.setName(name);
        this.setColor(color);
        this.setBasePrice(basePrice);
        this.setConsumption(consumption);
    }

    public Appliance(String name, String color, Float basePrice, Float consumption, Float weight) {
        this.setName(name);
        this.setColor(color);
        this.setBasePrice(basePrice);
        this.setConsumption(consumption);
        this.setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Float getBasePrice() {
        return basePrice;
    }

    public Float getConsumption() {
        return consumption;
    }

    public Float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBasePrice(Float basePrice) {
        if (basePrice > 0f)
            this.basePrice = basePrice;
    }

    public void setConsumption(Float consumption) {
        if (consumption > 0f)
            this.consumption = consumption;
    }

    public void setWeight(Float weight) {
        if (weight > 0f)
            this.weight = weight;
    }

    public boolean isLowConsumption() {
        return consumption < lowConsumption;
    }

    public Float getBalance() {
        return basePrice / weight;
    }

    public boolean isHighEnd() {
        return this.getBalance() > highEnd;
    }
}
