package org.example;

public interface Table {
    String orderItem(Orderable item);
    double getTotalPrice();
}
