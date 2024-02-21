package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dish dish = new Dish("manty", 270.0);
        Drink drink = new Drink("koncha", 300.4);
        Cafe cafe = new Cafe();
        cafe.LimitTable(2);
        CafeTable cafeTable1 = new CafeTable();
        cafeTable1.orderItem(dish);
        cafeTable1.orderItem(drink);
        System.out.println(cafeTable1.getTotalPrice());
        CafeTable cafeTable2 = new CafeTable();
        cafeTable2.orderItem(dish);
        System.out.println(cafeTable2.getTotalPrice());
        CafeTable cafeTable3 = new CafeTable();
        cafeTable3.orderItem(drink);
        System.out.println(cafeTable3.getTotalPrice());
    }
}
