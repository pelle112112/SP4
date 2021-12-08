import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int currentRoom = 1;
        int index = 0, input = 0;
        ArrayList<Room> rooms = new ArrayList();
        UI ui = new UI();
        NPC startNPC = new NPC();
        NPC NPC2 = new NPC();
        Inventory inventory = new Inventory();
        Player player = new Player(100,20,inventory);
        Combat combat = new Combat();
        DungeonLayout map = new DungeonLayout();

        ui.startMenu();

        rooms = map.getRooms();
        System.out.println(rooms);


        while (true) {
            input = ui.playerInteract(rooms.get(index),index);
            switch (input) {
                case 1:
                    if(ui.combatCounter == 0){
                        ui.NPCInteract(index, 1, rooms);
                    }
                    else {
                        ui.NPCInteract(index, 2, rooms);
                    }

                    break;

                case 2:

                    combat.combat(player.PlayerHealthPoints, rooms.get(index).mobs.healthPoints, player.PlayerDamagePoints, rooms.get(index).mobs.damagePoints);
                    player.inventory.items.add(rooms.get(index).mobs.itemDrop());

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
            }
        }



        //combat.combat(100,50, 20, 10);



    }



}
