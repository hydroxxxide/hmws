package org.example;

public class Test {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(5);

        Dish dish1 = new Dish("Плов", 1000);
        Drink drink1 = new Drink("Компот", 300);
        CafeTable table1 = cafe.getTable(1);
        table1.orderableItem(dish1);
        table1.orderableItem(drink1);
        System.out.println("Общая сумма заказа для столика 1: " + table1.getTotalPrice());

        Dish dish2 = new Dish("Пизда осла", 10000000);
        Drink drink2 = new Drink("Моча бабушки", 300000);
        CafeTable table2 = cafe.getTable(2);
        table2.orderableItem(dish2);
        table2.orderableItem(drink2);
        System.out.println("Общая сумма заказа для столика 2: " + table2.getTotalPrice());
    }
}