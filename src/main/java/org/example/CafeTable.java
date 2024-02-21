package org.example;

import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CafeTable implements Table{

    List<Orderable> orderableList = new ArrayList<>();
    @Override
    public void orderableItem(Orderable item) {
        orderableList.add(item);
    }

    @Override
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Orderable item : orderableList) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}