package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Dish implements Eatable, Orderable{

    private String name;
    private int price;

    @Override
    public String taste() {
        return "Еда: " + name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
