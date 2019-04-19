package moran.practico4.ejercicio3;

public abstract class CompOrders extends CollectionOrders {

    @Override
    public void add(Order order) {
        int i = 0;
        boolean find = false;
        while ((i < super.size()) && (!find)) {
            if (isLess(super.get(i), order))
                find = true;
            else
                i++;
        }
        if (find)
            super.insert(order, i);
        else
            super.addAtBack(order);
    }

    public abstract boolean isLess(Order order1, Order order2);
}
