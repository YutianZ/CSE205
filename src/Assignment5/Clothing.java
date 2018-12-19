package Assignment5;

public class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(String productId, int quantity, double unitPrice, String size, String color) {
        super(productId, quantity, unitPrice);
        this.size = size;
        this.color = color;
    }
    public void computeTotalCost() {
        totalCost = quantity * unitPrice;
    }
    public String toString() {
        return "\nClothing:\n" +
                super.toString() +
                "Size:\t\t\t\t" + size + "\n" +
                "Color:\t\t\t\t" + color + "\n";
    }
}
