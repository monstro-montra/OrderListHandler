import java.util.ArrayList;
import java.util.Collections;

public class Display {
    private ArrayList<Customer> ByName = new ArrayList<>(); //arraylist to store the customers in order by name
    private ArrayList<Customer> ByOrderNum = new ArrayList<>(); //arraylist to store the customers in order by order number
    public Main main = new Main();

    public Display(){ //default constructor

    }

    public void quickSort(ArrayList<Customer> list, int startIndex, int endIndex){
        //if start index and end index haven't overlapped
        if (startIndex < endIndex){
            //call partition function on pivotIndex
            int pivotIndex = partition(list, startIndex, endIndex);
            //sorting left sub list
            quickSort(list, startIndex, pivotIndex);
            //sorting right sub list
            quickSort(list, pivotIndex + 1, endIndex);
        }
    }

    public int partition(ArrayList<Customer> list, int startIndex, int endIndex){
        int pivotIndex = (startIndex +endIndex) / 2; //pivot index = (start + end) / 2
        Customer pivotValue = list.get(pivotIndex); //set pivot value to pivotIndex
        startIndex--; //decrement start index
        endIndex++; //increment end index
        while(true){
            //start at first index and add one. go forward until there is a value that is greater than pivotValue
            do {
                startIndex++;
            } while (list.get(startIndex).compareTo(pivotValue) < 0);

            //start last index and substract one. go backward until there is a value that is less than pivotValue
            do {
                endIndex--;
            } while (list.get(endIndex).compareTo(pivotValue) > 0);

            if (startIndex >= endIndex){
                return endIndex;
            }
            //swap elements
            Collections.swap(list, startIndex, endIndex);
        }
    }

    //getters and setters
    public ArrayList<Customer> getByName() {
        return ByName;
    }

    public ArrayList<Customer> getByOrderNum() {
        return ByOrderNum;
    }

    public void setByName(Order queue) {
        queue = main.getOrderList(); //get the order list from Main
        for (int i = 0; i < queue.getInList().size(); i++){ //copy everything from order list to the array list "ByName
            ByName.add(queue.getInList().get(i));
        }
        int start = ByName.indexOf(ByName.get(0));
        int end = ByName.indexOf(ByName.get(ByName.size() - 1));
        quickSort(ByName, start, end);
    }

    public void setByOrderNum(ArrayList<Customer> byOrderNum) {
        ByOrderNum = byOrderNum;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
