package org.example;

import java.util.ArrayList;

public class CafeTable implements Table{

    ArrayList<Orderable> OrderableItem = new ArrayList<>();

    @Override
    public String orderItem(Orderable item) {
        OrderableItem.add(item);
        return null;
    }

    @Override
    public double getTotalPrice() {
        return OrderableItem.stream().mapToDouble(Orderable::getPrice).sum();
    }
}
