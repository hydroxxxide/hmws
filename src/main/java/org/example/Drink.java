package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Drink implements Eatable, Orderable{
    private String name;
    private double price;


    @Override
    public String taste() {
        return "mmmmm";
    }

    @Override
    public double getPrice() {
        return price;
    }
}