public class CPU extends Item{
    public CPU (String name, Float price, int wattage){ //constructor
        this.setItemName(name);
        this.setItemCost(price);
        this.setWattage(wattage);
    }
}
