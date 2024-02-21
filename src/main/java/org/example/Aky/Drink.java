package org.example.Aky;

public class Drink  implements  Eatable ,Orderable{
    String name;
    int price;
    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String taste() {
        return ("Вкус бомба вообще но лучшк пиво а не " + name);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
