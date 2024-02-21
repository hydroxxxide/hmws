package org.example;

import Homework.CafeTable;
import Homework.Dish;
import Homework.Drink;

public class CafeTest {
    public static void main(String[] args) {

        Dish dish = new Dish("Ded", 6.9);
        Drink drink = new Drink("Sperm", 69.69);

        CafeTable cafe1 = new CafeTable();
        cafe1.orderItem(dish);
        cafe1.orderItem(drink);

        System.out.println(cafe1.getTotalPrice());
    }
}
