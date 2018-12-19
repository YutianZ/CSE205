package Assignment4;

public class Model {
    private String modelName = "?";
    private double cpuSpeed = 0.0;
    private int ramSize = 0;

    public Model(){}
    public String getModel() {
        return modelName;
    }
    public double getCPU() {
        return cpuSpeed;
    }
    public int getRAM() {
        return ramSize;
    }
    public void setModel(String modelName) {
        this.modelName = modelName;
    }
    public void setCPU(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }
    public void setRAM(int ramSize) {
        this.ramSize = ramSize;
    }
    public String toString() {
        return "\nModel:\t" + modelName + "\n" +
        "CPU:\t" + String.format("%.2f", cpuSpeed) + "GHz\n" +
        "RAM:\t" + ramSize + "GB\n";
    }
}
