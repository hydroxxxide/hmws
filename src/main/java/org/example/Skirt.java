package org.example;

public class Skirt extends Clotches implements WomensWear{
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Размер одежды: " + getSize() + ", " + "Стоимость одежды: " + getCost() + ", " + "Цвет одежды: " + getColor());
    }
}
