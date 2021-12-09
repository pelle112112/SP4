public class Armor extends Item{
    int armorBonus = 20;
    boolean armorUsed = false;


    public Armor(String itemDescription, String itemType, String itemName) {
        super(itemDescription, itemType, itemName);
    }
    public int equipArmor(int playerBaseHealth){
        if(armorUsed == false){
            playerBaseHealth=armorBonus+playerBaseHealth;
            armorUsed = true;
        }


        return playerBaseHealth;
    }
}
