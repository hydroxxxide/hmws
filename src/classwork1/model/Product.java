package classwork1.model;

public class Product {
    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
               ", article='" + article + '\'' +
               '}';
    }

    private String name;
    private double price;
    private String article;

    public Product(String name, double price, String article) {
        this.name = name;
        this.price = price;
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }
}
