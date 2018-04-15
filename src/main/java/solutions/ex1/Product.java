package solutions.ex1;

public class Product{

    private final TaxRate taxRate;
    private final String name;
    private final double price;

    public Product(String name, double price, TaxRate taxRate) {
        this.taxRate = taxRate;
        this.name = name;
        this.price = price;
    }

    public double getGrossValue(){
        return (1+taxRate.getRateValue())*price;
    }

    public double getPrice(){
        return price;
    }

    public TaxRate getTaxRate() {
        return taxRate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "taxRate=" + taxRate +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
