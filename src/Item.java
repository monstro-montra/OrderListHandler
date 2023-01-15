abstract class Item {
    //private fields
    private String itemName;
    private float itemCost;

    //getters and setters
    public String getItemName(){
        return this.itemName;
    }

    public float getItemCost(){
        return this.itemCost;
    }

    public void setItemName(String newItemName){
        this.itemName = newItemName;
    }

    public void setItemCost(Float newItemCost){
        this.itemCost = newItemCost;
    }
}
