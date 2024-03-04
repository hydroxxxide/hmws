package org.example;

public class Tie extends Clothes implements Menswear{
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {

    }
}
