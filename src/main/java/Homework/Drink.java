package Homework;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Drink implements Eatable, Orderable {
    private String taste;
    private double getPrice;


    @Override
    public String taste() {
        return null;
    }

    @Override
    public double getPrice() {
        return getPrice;
    }
}
