public class Main {
    private Order orderList = new Order(); //
    public static void main(String[] args){
        Main run = new Main();
        run.getOrderList();

        run.orderList.showQueue();
    }

    public Order getOrderList(){
        Customer alex = new Customer("Alex"); // init customer named alex
        alex.placeOrder(new Memory("Corsair Dominator", 289.99, 5));
        alex.placeOrder(new Case("NZXT H510", 89.99, 0, "ATX"));

        Customer melina = new Customer("Melina");
        melina.placeOrder(new GPU("GeForce 4070", 599.99, 120));
        melina.placeOrder(new Storage("WD Black 2TB", 169.99, 8 ));

        Customer marco = new Customer("Marco");
        marco.placeOrder(new GPU("GeForce 4060", 329.99, 100));

        Customer ronaldo = new Customer("Ronaldo");
        ronaldo.placeOrder(new CPU("Ryzen 7600X", 399.99, 125));
        ronaldo.placeOrder(new Motherboard("MSI MEG X670E ACE", 744.04, 75));

        orderList.enqueue(alex, melina, marco, ronaldo);
        return orderList;
    }
}
