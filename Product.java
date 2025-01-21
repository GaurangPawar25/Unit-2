public class Product {
    private String productName;
    private double price;
    private static int productCount = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        productCount++;
    }

    public static void displayProductCount() {
        System.out.println("Total products created: " + productCount);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000.0);
        Product p2 = new Product("Smartphone", 30000.0);
        Product p3 = new Product("Headphones", 2000.0);

        Product.displayProductCount();
    }
}
