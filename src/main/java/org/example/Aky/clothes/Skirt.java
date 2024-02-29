package org.example.Aky.clothes;

import lombok.AllArgsConstructor;

public class Skirt extends Clothes implements Womanswear {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {

    }
}
