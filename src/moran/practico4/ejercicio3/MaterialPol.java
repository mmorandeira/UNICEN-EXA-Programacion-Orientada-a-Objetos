package moran.practico4.ejercicio3;

public class MaterialPol extends Politic {

    private String material;

    public MaterialPol(String material) {
        this.material = material;
    }

    @Override
    public boolean acepted(Order order) {
        return material.equals(order.getMaterial());
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
