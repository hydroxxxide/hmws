package org.example.Aky.clothes;
class Atelier {
    Clothes[] clothes;

    void dressWomen() {
        System.out.println("Женская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof Womanswear) {
                ((Womanswear) c).dressWoman();
                System.out.println("Размер: " + c.size + ", Цена: " + c.cost + ", Цвет: " + c.color);
            }
        }
    }

    void dressMen() {
        System.out.println("Мужская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof Manswear) {
                ((Manswear) c).dressMan();
                System.out.println("Размер: " + c.size + ", Цена: " + c.cost + ", Цвет: " + c.color);
            }
        }
    }
}
