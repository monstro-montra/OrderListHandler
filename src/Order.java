import java.util.ArrayList;

public class Order {
    ArrayList<Item> queue;
    int head;
    int tail;
    int size;

    public Order(int size){ //constructor
        queue = new ArrayList<>();
        head = -1;
        tail = -1;
        this.size = size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Item enqueue(Item element){
        if(tail != queue.size() - 1) {
            tail++;
            queue.set(tail, element);//replace item at sail with new item, 'element'
            size++;
            return element;
        } else {
            return null;
        }

    }

    public Item peek(){
        Item elementToPeek = null;
        if(!isEmpty()){
            elementToPeek = queue.get(head + 1);
        }
        return elementToPeek;
    }

    public Item dequeue(){
        Item elementToDeque = null;
        if (size != 0){
            head++;
            elementToDeque = queue.get(head);
            size--;
        }
        return elementToDeque;
    }

}
