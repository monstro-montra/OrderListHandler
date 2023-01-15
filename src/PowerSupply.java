public class PowerSupply extends Item{
    public PowerSupply (String name, Float price, int wattage){ //constructor
        this.setItemName(name);
        this.setItemCost(price);
        this.setWattage(wattage);
    }
}
