package backend.domain.products;

public class Groceries extends Product{

    private Double costPerWeight;
    private Double weight;

    public Groceries(Double weight){
        super();
    }

    public Groceries(String productNumber, String productName, Double cost, Double price, Double costPerWeight, Double weight) {
        super(productNumber, productName, cost, price);
        this.costPerWeight = costPerWeight;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getCostPerWeight() {
        return costPerWeight;
    }

    public void setCostPerWeight(Double costPerWeight) {
        this.costPerWeight = costPerWeight;
    }

    @Override
    public Double getCost() {
        return costPerWeight * weight;
    }

    public Double getCost(Double cPWeight){
        return cPWeight * weight;
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * weight;
    }
}
