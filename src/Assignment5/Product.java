package Assignment5;

public abstract class Product {
    protected String productId = "?";
    protected int quantity = 0;
    protected double unitPrice = 0.0;
    protected double totalCost = 0.0;

    public Product(String productId, int quantity, double unitPrice) {
        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductId() {
        return productId;
    }

    public String toString(){
        return "\nProduct ID:\t\t\t" + productId + "\n" +
        "Quantity:\t\t\t" + quantity + "\n" +
        "Unit Price:\t\t\t" + String.format("$%.2f", unitPrice) +"\n" +
        "Total Cost:\t\t\t" + String.format("$%.2f", totalCost) + "\n";
    }
    public abstract void computeTotalCost();
}
