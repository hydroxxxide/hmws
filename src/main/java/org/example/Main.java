package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WomensWear> womenswearList = new ArrayList<>();
        womenswearList.add(new TShirt(Size.XXS, 2000, "Голубой"));
        womenswearList.add(new Skirt(Size.M, 500.25, "Красный"));

        List<MensWear> menswearList = new ArrayList<>();
        menswearList.add(new TShirt(Size.L, 1500, "Черный"));
        menswearList.add(new Pants(Size.S, 200, "Белый"));
        menswearList.add(new Tie(Size.XS, 900, "Желтый"));

        Atelier atelier = new Atelier();
        atelier.dressWoman(womenswearList);
        atelier.dressMan(menswearList);
    }
}
