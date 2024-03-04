package org.example;

public class Skirt extends Clothes implements Womenswear{
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {

    }
}
