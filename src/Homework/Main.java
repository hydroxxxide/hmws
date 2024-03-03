package Homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clothes> clothesList = new ArrayList<>();
        clothesList.add(new TShirt());
        clothesList.add(new Pants());
        clothesList.add(new Skirt());
        clothesList.add(new Tie());

        Atelier atelier = new Atelier();

        atelier.dressWoman(clothesList);
        atelier.dressMan(clothesList);
    }
}
