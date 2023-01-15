abstract class Item {
    //private fields
    private String itemName;
    private double itemCost;
    private int wattage;
    private int totalStock = 500;

    //getters and setters
    public String getItemName(){
        return this.itemName;
    }

    public double getItemCost(){
        return this.itemCost;
    }

    public int getWattage(){
        return this.wattage;
    }

    public void setItemName(String newItemName){
        this.itemName = newItemName;
    }

    public void setItemCost(double newItemCost){
        this.itemCost = newItemCost;
    }

    public void setWattage(int newWattage){
        this.wattage = newWattage;
    }

    public int getTotalStock() { //get total stock of item
        return totalStock;
    }

    public void setTotalStock(int newTotalStock) { //set total stock of item
        this.totalStock = newTotalStock;
    }

    @Override
    public String toString(){ //override toString method to display said Item as shown:
        return  "Item Name: " + getItemName() + "\n" +
                "Cost: " + getItemCost() + "\n" +
                "Wattage: " + getWattage()  + "\n";
    }
}
