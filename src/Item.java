abstract class Item {
    //private fields
    private String itemName;
    private float itemCost;
    private int wattage;

    //getters and setters
    public String getItemName(){
        return this.itemName;
    }

    public float getItemCost(){
        return this.itemCost;
    }

    public int getWattage(){
        return this.wattage;
    }

    public void setItemName(String newItemName){
        this.itemName = newItemName;
    }

    public void setItemCost(Float newItemCost){
        this.itemCost = newItemCost;
    }

    public void setWattage(int newWattage){
        this.wattage = newWattage;
    }
}
