public class Key extends Item{
    public Key(String itemDescription, String itemType, String itemName) {
        super(itemDescription, itemType, itemName);
    }

    @Override
    public String toString() {
        return "Key{" +
                "itemDescription='" + itemDescription + '\'' +
                ", itemType='" + itemType + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
