package solutions.ex1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
//        Bill bill = new Bill();
        Product product1 = new Product("flour",5,TaxRate.VAT23);
        Product product2 = new Product("sugar",6,TaxRate.VAT23);
        Product product3 = new Product("water",3,TaxRate.VAT8);
        Product product4 = new Product("chocolate",8,TaxRate.VAT5);
        Product product5 = new Product("vodka",20,TaxRate.NO_VAT);
        Product[] products = {product1,product2,product3,product4,product5};
        PriorityQueue<Product> queue = new PriorityQueue<>(new ProductComparator());
//        for (Product product : products) {
//            queue.add(product);
//        }
//        System.out.println(queue);
//        Product productPolled  = queue.poll();
//        System.out.println(productPolled);
//        System.out.println(queue);
        Instant instant = Instant.now();
        Instant instant1 = Instant.now().plusMillis(1000);
        System.out.println(instant.compareTo(instant1));

//        List<Product> productList = Arrays.asList(products);
//        System.out.println(productList);
//        productList.sort(new ProductComparator());
//        System.out.println(productList);
//        Instant timestamp = Instant.now().plusSeconds(10);
//        long timestamp2 =  System.currentTimeMillis();
//
//        for (Product product : products) {
//            bill.addProduct(product);
//        }
//
//        bill.printBill();
        LocalDate localDate = LocalDate.now();
        Instant time = Instant.now().plus(2,ChronoUnit.DAYS).plus(2,ChronoUnit.MINUTES);



    }
}
