package org.example.Aky;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        CafeTable table1 = new CafeTable();
        cafe.addTable(table1);

        Dish dish1 = new Dish("Говно бомжа", 100);
        Drink drink1 = new Drink("Моча бомжа", 50);

        Scanner scanner = new Scanner(System.in);
        boolean Run = true;

        while (Run) {
            System.out.println(" Выберите действие: ");
            System.out.println("1.Добавить блюдо в заказ");
            System.out.println("2.Добавить напиток в заказ");
            System.out.println("3.Показать общую стоимость заказа");
            System.out.println("4.Выход");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    table1.orderitem(dish1);
                    System.out.println("Вы добавили " + dish1.taste() + " в заказ. Стоимость: " + dish1.getPrice());
                    break;
                case 2:
                    table1.orderitem(drink1);
                    System.out.println("Вы добавили " + drink1.taste() + " в заказ. Стоимость: " + drink1.getPrice());
                    break;
                case 3:
                    System.out.println("Общая стоимость заказа: " + table1.getTotalPrice());
                    break;
                case 4:
                    Run = false;
                    break;
                default:
                    System.out.println("Динах трайкетчей не будет");
            }
        }
    }
}
