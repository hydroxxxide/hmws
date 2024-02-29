package org.example.Aky;

import java.util.ArrayList;
import java.util.List;

public class CafeTable implements Table {
    int totalPrice;
    List<Orderable> allOrders = new ArrayList<>();
    @Override
    public void orderitem(Orderable food) {
        allOrders.add(food);
    }

    @Override
    public int getTotalPrice() {
        return  allOrders.stream()
                .mapToInt(Orderable::getPrice)
                .sum();
    }

}
