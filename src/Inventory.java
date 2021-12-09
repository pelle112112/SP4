import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();
    Armor armor;
    HealthPot healthPot;
    Weapon weapon = new Weapon("23","23","23");



    public int addItemToInventory(Item item){
        items.add(item);
        int playerhealth = 0;
        if(item == armor){
            playerhealth = 20;
            return playerhealth;
        }
        else {
            return playerhealth;
        }
    }

    public void removeItemFromInventory(Item item){
        items.remove(item);
    }

    public void displayItems(){
        System.out.println(items.toString());
    }

}
