public class Armor extends Item{
    int armorBonus = 20;


    public Armor(String itemDescription, String itemType, String itemName) {
        super(itemDescription, itemType, itemName);
    }
    public int equipArmor(int playerBaseHealth){
        playerBaseHealth=armorBonus+playerBaseHealth;
        return playerBaseHealth;
    }
}
