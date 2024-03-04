package org.example;

public class TShirt extends Clothes implements Menswear, Womenswear {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWoman() {

    }
}
