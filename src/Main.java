public class Main {
    public static void main(String[] args){
        Case case1 = new Case("Corsair 500D", 129.99, 0, "Mid-Tower ATX");

        System.out.println(case1);

        Customer customer1 = new Customer("Alex");

        customer1.placeOrder(new Memory("Corsair Dominator", 289.99, 5));
    }
}
