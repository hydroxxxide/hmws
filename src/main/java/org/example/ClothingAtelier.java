package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClothingAtelier implements Menswear, Womenswear {
     List<Clothes> menClothes = new ArrayList<>();
     List<Clothes> womenClothes = new ArrayList<>();



     @Override
     public void dressMan() {
          for (Clothes clothes : menClothes){
               System.out.println(clothes);
          }
     }

     @Override
     public void dressWoman() {
          for (Clothes clothes : womenClothes){
               System.out.println(clothes);
          }
     }
}
