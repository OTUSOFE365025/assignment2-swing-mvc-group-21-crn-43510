public class Product {
    private String upc_code;
    private String name;
    private double price;

    public Product(String upc_code, String name, double price) {
        this.upc_code = upc_code;
        this.name = name;
        this.price = price;
    }

    public String getUPC_Code() {
        return upc_code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", price);
    }
}
