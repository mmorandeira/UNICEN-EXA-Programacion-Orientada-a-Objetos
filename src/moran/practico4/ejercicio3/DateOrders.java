package moran.practico4.ejercicio3;

public class DateOrders extends CompOrders {
    @Override
    public boolean isLess(Order order1, Order order2) {
        return order2.getMaxDate().isAfter(order1.getMaxDate());
    }
}
