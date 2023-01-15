public class Motherboard extends Item{
    public Motherboard (String name, double price, int wattage){ //constructor
        this.setItemName(name);
        this.setItemCost(price);
        this.setWattage(wattage);
    }
}
