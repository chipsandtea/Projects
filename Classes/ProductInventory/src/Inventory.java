import java.util.HashMap;
import java.util.Map;

public class Inventory{
    private String store_name;
    private double total_value;
    private HashMap<Integer, Product> product_listing;
    private int prod_counter;


    public Inventory(String name){
        this.store_name = name;
        this.total_value = 0.0;
        prod_counter = 0;
        product_listing = new HashMap<Integer, Product>();
    }

    private void updateTotalValue(){
        this.total_value = 0;
        for(Map.Entry<Integer, Product> entry : product_listing.entrySet()) {
            Product curr_product = entry.getValue();
            double value_from_product;
            value_from_product = curr_product.getValue() * curr_product.getQuantity();
            total_value += value_from_product;
        }
    }

    public void addProduct(String product_name, double value, int init_quantity){
        Product new_product = new Product(product_name, value, init_quantity);
        prod_counter++;
        product_listing.put(prod_counter, new_product);
        System.out.println((product_listing.get(prod_counter).getName()));
    }

    public String getName(){
        return store_name;
    }

    public double getTotalValue(){
        return total_value;
    }



}

