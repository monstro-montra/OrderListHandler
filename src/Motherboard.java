public class Motherboard extends Item{
    public Motherboard (String name, Float price, int wattage){ //constructor
        this.setItemName(name);
        this.setItemCost(price);
        this.setWattage(wattage);
    }
}
