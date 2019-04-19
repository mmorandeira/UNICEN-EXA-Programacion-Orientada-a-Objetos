package moran.practico4.ejercicio3;

public class ArrivalOrders extends CollectionOrders {
    @Override
    public void add(Order order) {
        super.addAtBack(order);
    }
}
