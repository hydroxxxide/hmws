package org.example;

import java.util.List;

public class Atelier {
    public void dressWoman(List<WomensWear> clothes) {
        for (WomensWear i : clothes) {
            i.dressWoman();
        }
    }

    public void dressMan(List<MensWear> clothes) {
        for (MensWear i : clothes) {
            i.dressMen();
        }
    }
}
