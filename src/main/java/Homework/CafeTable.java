package Homework;


import java.util.ArrayList;
import java.util.List;

public class CafeTable implements Table {
    List<Orderable> orderedItems = new ArrayList<>();

        @Override
        public String orderItem(Orderable item) {
            orderedItems.add(item);
            return null;
        }

        @Override
        public double getTotalPrice() {
            return orderedItems.stream().mapToDouble(Orderable::getPrice).sum();
        }
    }

