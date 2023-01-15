import java.util.ArrayList;

public class Order {
    private ArrayList<Customer> queue;
    private int head;
    private int tail;

    public Order(){ //constructor
        queue = new ArrayList<>();
        head = -1;
        tail = -1;
    }

    public ArrayList<Customer> getInList() {
        return queue;
    }

    public void showQueue(){
        for (int i = 0; i < queue.size(); i++){
            System.out.println("Customer " + i + ": " + queue.get(i).toString());
        }
    }

    //add item to head end
    public void enqueue(Customer ... elements){ //automatically creates an array to be able to enqueue multiple elements at once.
        for (Customer element : elements) {
            if (queue.isEmpty()) { //if queue is empty
                head = 0;
                tail = 0;
                queue.add(element);
            } else { //if not empty
                head++; //add one to front.
                if (queue.size() > head) {
                    queue.set(head, element);
                } else {
                    queue.add(element);
                }
            }
        }
    }

    //delete element from the tail end
    public void dequeue(){
        System.out.println("Removing customer from queue.");
        if(queue.isEmpty()){ // if the queue is empty
            System.out.println("Queue is empty.");
        } else if (head == tail){ //if they are both at same element. (only one element )
            head = -1;
            tail = -1;
        } else {
            queue.remove(tail);
        }
    }

}
