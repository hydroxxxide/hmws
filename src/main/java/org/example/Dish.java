package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dish implements Eatable,Orderable {
    private String name;

    private double price;


    @Override
    public String taste() {
        return "Ahuenno";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
