import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();



    public void addItemToInventory(Item item){
        items.add(item);
    }

    public void removeItemFromInventory(Item item){
        items.remove(item);
    }

    public void displayItems(){
        System.out.println(items);
    }

}
