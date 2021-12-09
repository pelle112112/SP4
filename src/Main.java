import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        boolean key2Added = false, key3Added = false;
        int index = 0, input = 0;
        ArrayList<Room> rooms = new ArrayList();
        UI ui = new UI();
        NPC startNPC = new NPC();
        NPC NPC2 = new NPC();
        Inventory inventory = new Inventory();
        Player player = new Player(250,20,inventory);
        Combat combat = new Combat();
        DungeonLayout map = new DungeonLayout();

        ui.startMenu();

        rooms = map.getRooms();


        while (true) {
            input = ui.playerInteract(rooms.get(index),index, player, rooms);

            if (index == 3 && key2Added == false){
                player.inventory.addItemToInventory(rooms.get(3).key);
                key2Added = true;
            }
            if(index == 9 && key3Added == false){
                player.inventory.addItemToInventory(rooms.get(9).key);
                key3Added = true;
            }


            switch (input) {
                case 1:
                        ui.NPCInteract(index, rooms.get(index), rooms);
                    if(index == 7){
                        player.inventory.addItemToInventory(rooms.get(7).armor);
                        player.armorHPIncreaser();
                        player.inventory.addItemToInventory(rooms.get(7).healthPot);
                    }

                    break;

                case 2:

                    player.setPlayerHealthPoints(combat.combat(player.PlayerHealthPoints, rooms.get(index).mobs.healthPoints, player.PlayerDamagePoints, rooms.get(index).mobs.damagePoints));
                    player.inventory.items.add(rooms.get(index).mobs.itemDrop());
                    if(index == 1){
                        player.damageIncreaser();
                    }

                    break;

                case 3:

                    break;

                case 4:
                    index = ui.enterRoom(index, rooms, 1, player);
                    break;

                case 5:
                    index = ui.enterRoom(index, rooms, 2,player);
                    break;

                case 6:
                    index =ui.enterRoom(index, rooms, 3,player);
                    break;

                case 7:
                    index = ui.enterRoom(index, rooms, 4,player);
                    break;

                case 8:
                    player.useHealthPotion();
                    for (int i = 0; i < player.inventory.items.size(); i++) {
                        player.inventory.items.remove(rooms.get(i).healthPot);
                    }

                    break;
            }
        }
    }
}
