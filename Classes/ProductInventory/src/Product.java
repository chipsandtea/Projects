

public class Product{
    private String product_name;
    private int quantity;
    private double value;

    public Product(String product_name, double value){
            this.product_name = product_name;
            this.value = value;
            this.quantity = 1;
        }

    public Product(String product_name, double value, int init_quantity){
            this.product_name = product_name;
            this.value = value;
            this.quantity = init_quantity;
        }

    public int getQuantity(){
            return quantity;
        }

    public double getValue(){
            return value;
        }

    public String getName(){
            return product_name;
        }

    public void addItems(int count){
            quantity += count;
        }


}