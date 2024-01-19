package classwork1;

import classwork1.model.Catalog;
import classwork1.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Шампунь Жумайсыбма", 2.69, "SHJ-69");
        Product product2 = new Product("Дилдо 23сантиметра", 224.69, "D-23");
        Product product3 = new Product("Latex glove ultra pro max", 1213.69, "LX-99");
        Product product4 = new Product("Горелый еврей", 0.69, "GI-41");
        Product product5 = new Product("плов узбекский", 1500.69, "UZ-998");
        Product product6 = new Product("Гель-скраб лля мозга (маленбкий пенис)", 13.5, "ISH-13");

        List<Product> products = new ArrayList<>(List.of(product1, product2, product3, product4, product5, product6));
        Catalog catalog = new Catalog(products);

        System.out.println("------------Catalog------------");
        for (Product p : products){
            System.out.println(p);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Admin Panel----------");
        while (true){
            System.out.println("Здарова админ, выбери дейсвтие: ");
            System.out.println("1. Создать новый продукт");
            System.out.println("2. Удалить сущ продукт");
            System.out.println("3. Вытщаить каталог");
            int operation = scanner.nextInt();

            if (operation == 1){
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Введите название продукта: ");
                String name = scanner1.nextLine();
                System.out.println("Введите цену: ");
                double price = scanner1.nextDouble();
                price += price;
                System.out.println("Придумайте артикул: ");
                Scanner scanner13 = new Scanner(System.in);
                String article = scanner13.nextLine();
                Product product = new Product(name, price, article);
                catalog.saveProduct(product);
            }

            if (operation == 2){
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите артикул уничтожаемого товара: ");
                String article = scanner2.nextLine();
                List<Product> allProducts = catalog.getProducts();
                allProducts.removeIf(p -> p.getArticle().equals(article));
                System.out.println();
                System.out.println();
                catalog.setProducts(allProducts);
            }

            if (operation == 3){
                catalog.getProducts().forEach(System.out::println);
            }
        }

    }
}
