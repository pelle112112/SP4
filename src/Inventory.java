import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();
    Armor armor;


    public int addItemToInventory(Item item) {
        items.add(item);
        int playerhealth = 0;
        if (item == armor) {
            playerhealth = 20;
            return playerhealth;
        } else {
            return playerhealth;
        }
    }


}
