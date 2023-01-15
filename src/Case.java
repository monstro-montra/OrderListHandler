public class Case extends Item{
    public Case (String name, Float price, int wattage){ //constructor
        this.setItemName(name);
        this.setItemCost(price);
        this.setWattage(wattage);
    }
}
