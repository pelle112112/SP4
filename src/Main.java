import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws Exception{

        boolean key2Added = false, key3Added = false;
        int index = 0, input = 0;
        ArrayList<Room> rooms = new ArrayList();
        UI ui = new UI();
        Inventory inventory = new Inventory();
        Player player = new Player(250,20,inventory);
        Combat combat = new Combat();
        DungeonLayout map = new DungeonLayout();



        rooms = map.getRooms();
        ui.startMenu(rooms);

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

                    break;

                case 2:

                    try {
                        if(rooms.get(index).mobs == null){
                            throw new NullPointerException();
                        }
                        if(rooms.get(index).combatCounter == false){
                            rooms.get(index).combatCounter = true;
                            player.setPlayerHealthPoints(combat.combat(player.PlayerHealthPoints, rooms.get(index).mobs.healthPoints, player.PlayerDamagePoints, rooms.get(index).mobs.damagePoints));
                            player.inventory.items.add(rooms.get(index).mobs.itemDrop());
                            player.damageIncreaser();
                            System.out.println(rooms.get(index).System2);

                        }
                        else {
                            System.out.println("The mob is already dead!");
                        }

                    }
                    catch (NullPointerException e){
                        System.out.println("The mob is already dead!");
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
                    index = ui.enterRoom(index, rooms, 3,player);
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

                case 9:
                    if(rooms.get(7).chestOpened == false) {
                        System.out.println(rooms.get(7).System2);

                        player.inventory.addItemToInventory(rooms.get(7).armor);
                        player.armorHPIncreaser();
                        player.inventory.addItemToInventory(rooms.get(7).healthPot);
                        rooms.get(7).chestOpened = true;
                    }
                    break;

                case 10:

                    //Todo: Lav sidste rum færdigt.
                    break;
            }
        }
    }
}
