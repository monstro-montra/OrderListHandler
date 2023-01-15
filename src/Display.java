public class Display<Customer extends Comparable<? super Object>>{
    private Customer[] ByName; //arraylist to store the customers in order by name
    private Customer[] ByOrderNum; //arraylist to store the customers in order by order number
    private CustomerNameCompare customerNameCompare = new CustomerNameCompare();
    private CustomerOrderNumCompare customerOrderNumCompare = new CustomerOrderNumCompare();
    public Main main = new Main();

    public Display(){ //default constructor

    }

    private void quickSortByName(Customer[] arr, int startIndex, int endIndex){
        //if start index and end index haven't overlapped
        if (startIndex < endIndex){
            //call partition function on pivotIndex
            int pivotIndex = partition(arr, startIndex, endIndex);
            //sorting left sub list
            quickSortByName(arr, startIndex, pivotIndex);
            //sorting right sub list
            quickSortByName(arr, pivotIndex + 1, endIndex);
        }
    }

    private void quickSortByOrderNum(Customer[] arr, int startIndex, int endIndex){
        //if start index and end index haven't overlapped
        if (startIndex < endIndex){
            //call partition function on pivotIndex
            int pivotIndex = partition(arr, startIndex, endIndex);
            //sorting left sub list
            quickSortByOrderNum(arr, startIndex, pivotIndex);
            //sorting right sub list
            quickSortByOrderNum(arr, pivotIndex + 1, endIndex);
        }
    }

    private int partition(Customer[] arr, int startIndex, int endIndex){
        int pivotIndex = (startIndex + endIndex) / 2;
        Customer pivotValue = arr[pivotIndex]; //set pivot value to pivotIndex
        startIndex--; //decrement start index
        endIndex++; //increment end index
        while(true){
            //start at first index and add one. go forward until there is a value that is greater than pivotValue
            do {
                startIndex++;
            } while (arr[startIndex].compareTo(pivotValue) < 0) ;


            //start last index and subtract one. go backward until there is a value that is less than pivotValue
            do {
                endIndex--;
            } while (arr[endIndex].compareTo(pivotValue) > 0);

            if (startIndex >= endIndex){
                return endIndex;
            }
            //swap elements
            Customer temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
    }

    public void displayByName(){
        for(int i = 0; i < ByName.length; i++){
            System.out.println(ByName[i].getName());
        }
    }

    public void displayByOrderNum(){
        for(int i = 0; i < ByOrderNum.length; i++){
            System.out.println(ByOrderNum[i].getOrderNumber());
        }
    }



    //getters and setters
    public Customer[] getByName() {

        return ByName;
    }

    public Customer[] getByOrderNum() {
        return ByOrderNum;
    }

    public void setByName() {
        Order queue = main.getOrderList();
        queue = main.getOrderList(); //get the order list from Main
        ByName = new Customer[queue.getInList().size()];
        ByOrderNum = queue.getInList().toArray(ByName);
        int start = 0;
        int end = ByName.length - 1;
        quickSortByName((Customer[]) ByName, start, end);
    }

    public void setByOrderNum() {
        Order queue = main.getOrderList(); //get the order list from Main
        ByOrderNum = new Customer[queue.getInList().size()];
        ByOrderNum = queue.getInList().toArray(ByOrderNum);
        int start = 0; //instantiate start for the sort
        int end = ByOrderNum.length - 1; //instantiate end for the sort
        quickSortByOrderNum((Customer[]) ByOrderNum, start, end);
    }
}
