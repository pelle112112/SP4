import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int currentRoom = 1;
        ArrayList rooms = new ArrayList();
        UI ui = new UI();
        NPC startNPC = new NPC();
        NPC NPC2 = new NPC();
        Combat combat = new Combat();
        DungeonLayout map = new DungeonLayout();

        ui.startMenu();

        rooms = map.getRooms();



        combat.combat(100,50, 20, 10);



    }



}
