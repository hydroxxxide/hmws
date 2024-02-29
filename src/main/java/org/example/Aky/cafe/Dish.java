package org.example.Aky;

public class Dish implements  Eatable ,Orderable{
    String name;
    int price;
    public Dish(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String taste() {
        return("На вкус как говно если честно" + name);
    }

    @Override
    public int getPrice() {

        return price;
    }
}
