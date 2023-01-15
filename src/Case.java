public class Case extends Item{
    //private fields
    private String type;

    public Case (String name, double cost, int wattage, String type){ //constructor
        this.setItemName(name);
        this.setItemCost(cost);
        this.setWattage(wattage);
        this.setType(type);
    }

    //getters and setters for the type of case this is. (could be itx, atx, microatx, etc.)
    public String getType(){
        return this.type;
    }

    public void setType(String newType){
        this.type = newType;
    }

    @Override
    public String toString(){
        return  "Item Name: " + getItemName() + "\n" +
                "Cost: " + getItemCost() + "\n" +
                "Wattage: " + getWattage()  + "\n" +
                "Type: " + getType();
    }
}
