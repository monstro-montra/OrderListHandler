public class PowerSupply extends Item{
    public PowerSupply (String name, double price, int wattage){ //constructor
        this.setItemName(name);
        this.setItemCost(price);
        this.setWattage(wattage);
    }
}
