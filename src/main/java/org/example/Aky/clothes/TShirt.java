package org.example.Aky.clothes;
public class TShirt extends Clothes implements Manswear,Womanswear{
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {


    }

    @Override
    public void dressWoman() {

    }
}
