package org.example;

public class Tie extends Clotches implements MensWear{
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Размер одежды: " + getSize() + ", " + "Стоимость одежды: " + getCost() + ", " + "Цвет одежды: " + getColor());
    }
}
