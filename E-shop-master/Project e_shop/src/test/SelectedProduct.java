package test;

public class SelectedProduct {

    private int code;
    private String name;
    private String description;
    private int quantity;
    private double totalCost;
    private double price;

    // Getters

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    // Setters
    public void setTotalCost() {
        this.totalCost = getPrice() * getQuantity();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
