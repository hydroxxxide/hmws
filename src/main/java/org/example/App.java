package org.example;

public class App
{
    public static void main( String[] args )
    {
        ClothingAtelier clothingAtelier = new ClothingAtelier();
        clothingAtelier.menClothes.add(new Pants(ClothingSize.XS, 23.5, "blue"));
        clothingAtelier.dressMan();

    }
}
