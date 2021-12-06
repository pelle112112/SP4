public abstract class Item {
    String itemDescription;
    String itemType;  // fx Sword, Armor, Potion
    String itemName;

    public Item(String itemDescription, String itemType, String itemName) {
        this.itemDescription = itemDescription;
        this.itemType = itemType;
        this.itemName = itemName;
    }

    protected Item() {
    }
}

