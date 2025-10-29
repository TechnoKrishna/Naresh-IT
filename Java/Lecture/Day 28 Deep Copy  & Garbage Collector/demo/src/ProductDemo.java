class Product {
    private double price;

    public Product() {
    }

    public Product(double price) {
        super();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [price=" + price + "]";
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(5000);

        System.out.println(p1 + " : " + p2);

        // Copy the content of p2 to initialize the p1 data
        p1.setPrice(p2.getPrice());

        System.out.println("After copy");
        System.out.println(p1 + " : " + p2);

        p2.setPrice(9000);
        System.out.println("After Modification in p2");
        System.out.println(p1 + " : " + p2);
    }
}