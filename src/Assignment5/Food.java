package Assignment5;

public class Food extends Product {
    private String name;
    private double damageRate;
    private String expirationDate;

    public Food(String productId, int quantity, double unitPrice, String name, double damageRate, String expirationDate) {
        super(productId, quantity, unitPrice);
        this.name = name;
        this.damageRate = damageRate;
        this.expirationDate = expirationDate;
    }

    public void computeTotalCost() {
        totalCost = (unitPrice * quantity) * (1 + damageRate);
    }

    public String toString() {
        return "\nFood:\n" +
                super.toString() +
                "Food Name:\t\t\t" + name + "\n" +
                "Damage Rate:\t\t" + String.format("%.2f", damageRate*100) + "%\n" +
                "Expiration Date:\t" + expirationDate + "\n";
    }
}
