package Assignment5;

public class ProductParser {
    public static Product parseStringToProduct(String lineToParse) {
        String[] str = lineToParse.split("/");
        Product product;
        if(str[0].toUpperCase().equals("CLOTHING")) {
            product = new Clothing(str[1], Integer.parseInt(str[2]), Double.parseDouble(str[3]), str[4], str[5]);
        } else {
            product = new Food(str[1], Integer.parseInt(str[2]), Double.parseDouble(str[3]), str[4], Double.parseDouble(str[5]), str[6]);
        }
        return product;
    }
}
