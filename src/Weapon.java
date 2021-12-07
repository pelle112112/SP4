public class Weapon extends Item {
    String typeofWeapon;
    int weaponDamage = 15;


    public Weapon(String itemDescription, String itemType, String itemName) {
        super(itemDescription, itemType, itemName);
    }
    public int equipWeapon(int playerBaseDamage){

        playerBaseDamage=weaponDamage+playerBaseDamage;
        return playerBaseDamage;
    }
}
