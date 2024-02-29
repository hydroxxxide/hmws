package org.example.Aky.clothes;
public class Main {
    public static void main(String[] args) {
        TShirt manTShirt = new TShirt(Size.M, 1000, "Синий");
        TShirt womanTShirt = new TShirt(Size.S, 800, "Красный");
        Pants manPants = new Pants(Size.L, 1500, "Черный");
        Skirt womanSkirt = new Skirt(Size.XS, 1200, "Фиолетовый");

        Atelier atelier = new Atelier();
        atelier.clothes = new Clothes[]{manTShirt, womanTShirt, manPants, womanSkirt};

        atelier.dressMen();
        atelier.dressWomen();
    }
}