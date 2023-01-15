import java.util.Comparator;

class CustomerNameCompare implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getName().compareTo(c2.getName()); //compare names of both customers
    }
}

class CustomerOrderNumCompare implements Comparator<Customer>{
    @Override
    public int compare(Customer c1, Customer c2) {
        if(c1.getOrderNumber() == c2.getOrderNumber()){ //if both order numbers equal each other
            return 0;

        } else if (c1.getOrderNumber() < c2.getOrderNumber()) { //if c1 order num < c2 order num
            return -1;

        } else { //if c1 order num > c2 order num
            return 1;
        }
    }
}
