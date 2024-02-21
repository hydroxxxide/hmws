package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Drink implements Eatable, Orderable {

    private String name;
    private int price;

    @Override
    public String taste() {
        return "Напиток: " + name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
