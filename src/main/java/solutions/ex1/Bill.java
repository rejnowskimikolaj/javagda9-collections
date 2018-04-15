package solutions.ex1;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private final List<Product> products;

    public Bill() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double sumUpGross() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getGrossValue();
        }
        return sum;
    }

    public double sumUpNet() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }

        return sum;
    }

    public double giveSumIfAllHad(TaxRate taxRate){
        return (1+taxRate.getRateValue())*sumUpNet();
    }

    public double howMuchDoesGovTake() {
        return sumUpGross() - sumUpNet();
    }

    public void printProducts() {
        System.out.println(products);
    }

    public void printBill() {
        for (Product product : products) {
            System.out.println(product.getName() + ": NET: " + product.getPrice() + ", TAX: " + product.getTaxRate() + ", GROSS: " + product.getGrossValue());
        }
    }

}
