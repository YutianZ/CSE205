package Assignment4;

public class Laptop {
    private String brandName = "?";
    private Model model = new Model();
    private double price = 0.0;

    public Laptop() {}
    public String getBrand() {
        return brandName;
    }
    public Model getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public void setBrand(String brandName) {
        this.brandName = brandName;
    }
    public void setModel(String modelName, double cpu, int ram) {
        model.setModel(modelName);
        model.setCPU(cpu);
        model.setRAM(ram);
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return "\nBrand:\t" + brandName +
                model.toString() +
                "Price:\t" + String.format("$%.2f", price) +"\n";
    }
}
