package moran.practico4.ejercicio3;

public class CostOrders extends CompOrders {
    @Override
    public boolean isLess(Order order1, Order order2) {
        return order1.getCost() < order2.getCost();
    }
}
