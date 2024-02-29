package org.example.Aky.clothes;

import lombok.AllArgsConstructor;

public class Pants extends Clothes implements Manswear,Womanswear{
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
