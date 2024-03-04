package org.example;

public class Pants extends Clotches implements MensWear, WomensWear{

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Размер одежды: " + getSize() + ", " + "Стоимость одежды: " + getCost() + ", " + "Цвет одежды: " + getColor());
    }

    @Override
    public void dressWoman() {
        System.out.println("Размер одежды: " + getSize() + ", " + "Стоимость одежды: " + getCost() + ", " + "Цвет одежды: " + getColor());
    }
}
