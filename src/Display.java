public class Display<T extends Comparable<? super T>>{
    private T[] ByName; //arraylist to store the customers in order by name
    private T[] ByOrderNum; //arraylist to store the customers in order by order number
    public Main main = new Main();

    public Display(){ //default constructor

    }

    private void quickSort(T[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot);
            quickSort(arr, pivot + 1, end);
        }
    }


    private int partition(T[] array, int start, int end)
    {
        int midpoint = (start + end) / 2;
        T pivotValue = array[midpoint];
        start--; //decrement start
        end++; //increment start

        while (true)
        {
            // start at first index of subarray. increment forward until it is > pivotValue
            do {
                start++;
            } while (array[start].compareTo(pivotValue) < 0) ;

            // start at last index subarray and increment backward until it is < pivotValue
            do {
                end--;
            } while (array[end].compareTo(pivotValue) > 0) ;

            if (start >= end) return end;

            // swap values
            T temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
    }

    public void displayByName(){
        for(int i = 0; i < ByName.length; i++){
            System.out.println(ByName[i]);
        }
    }

    public void displayByOrderNum(){
        for(int i = 0; i < ByOrderNum.length; i++){
            System.out.println(ByOrderNum[i]);
        }
    }


    //getters and setters
    public T[] getByName() {

        return ByName;
    }

    public T[] getByOrderNum() {
        return ByOrderNum;
    }

    public void setByName() {
        Order queue = main.getOrderList();
        ByName = (T[]) new Customer[queue.getInList().size()]; //instantiate the size
        ByName = queue.getInList().toArray(ByName); //convert the list to an array
        int start = 0;
        int end = ByName.length - 1;
        quickSort(ByName, start, end);
    }



    public void setByOrderNum() {
        Order queue = main.getOrderList(); //get the order list from Main
        ByOrderNum = (T[]) new Customer[queue.getInList().size()];
        ByOrderNum = queue.getInList().toArray(ByOrderNum);
        int start = 0; //instantiate start for the sort
        int end = ByOrderNum.length - 1; //instantiate end for the sort
        quickSort(ByOrderNum, start, end);
    }

}
