package org.example;

public class Pants extends Clothes implements Menswear, Womenswear {


    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        System.out.println("Брюки");
        System.out.println("Размер " + getSize());
        System.out.println("Цена " + getCost());
        System.out.println("Цвет " + getColor());
        return "-----------------";
    }
}
