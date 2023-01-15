import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {
    //customer fields
    private String name;
    private long orderNumber;
    private double totalCost;
    private ArrayList<Item> cart = new ArrayList<>();

    public Customer(String name){//constructor for initializing a customer
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO
    public double getTotalCost() {
        double sum = 0; //sum starts at 0.
        for(int i = 0; i < cart.size(); i++){
            sum += cart.get(i).getItemCost(); //add
        }
        return sum;
    }

    public long getOrderNumber() {
        long min = 1000000;
        long max = 9999999;
        orderNumber = ThreadLocalRandom.current().nextLong(min, max +1 );
        return orderNumber;
    }

    public void placeOrder(Item item){
        cart.add(item);
    }

}
