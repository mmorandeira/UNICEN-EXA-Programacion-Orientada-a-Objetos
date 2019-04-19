package moran.practico4.ejercicio3;

import java.util.List;
import java.util.Vector;

public abstract class CollectionOrders {
    Vector<Order> orderVector;
    List<Order> list;

    public abstract void add(Order order);

    public Order dequeue() {
        Order aux = orderVector.get(0);
        orderVector.remove(0);
        return aux;
    }

    public int size() {
        return orderVector.size();
    }

    protected Order get(int index) {//utilizo esto para que la clase hijo no dependa de la estructura de esta clase
        return orderVector.get(index);
    }

    protected void insert(Order order, int index) {
        orderVector.insertElementAt(order, index);
    }

    protected void addAtBack(Order order) {
        orderVector.add(order);
    }
}
