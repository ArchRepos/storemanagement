package backend.domain.products;

public class Product implements Comparable<Product>{

    private String productNumber;
    private String productName;
    private Double cost;
    private Double price;

    public Product(){}

    public Product(String productNumber, String productName, Double cost, Double price) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.cost = cost;
        this.price = price;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber='" + productNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }

    public int compareTo(Product product) {
        return 0;
    }

    //prod1, 45 <-- this,   prod2, 46 <-- input param product
}
