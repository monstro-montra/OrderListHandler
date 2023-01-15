import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Customer implements Comparable<Customer> {
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
        totalCost = 0; //totalCost starts at 0.
        for(int i = 0; i < cart.size(); i++){
            totalCost += cart.get(i).getItemCost(); //add
        }
        return totalCost;
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

    @Override
    public String toString(){ //override toString method to display said Customer info as shown:
        return  "Customer Name: " + getName() + "\n" +
                "Order Number: " + getOrderNumber() + "\n" +
                "Total Cost: " + getTotalCost()  + "\n";
    }

    @Override
    public int compareTo(Customer o) {
        return Comparator.comparing(Customer::getName)
                .compare(this, o);
    }

}
