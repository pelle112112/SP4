public class Main {

    public static void main(String[] args) {

        int currentRoom = 1;
        UI ui = new UI();
        NPC startNPC = new NPC();
        DungeonLayout map = new DungeonLayout();

        ui.startMenu();
        Room room1 = new Room(1, startNPC, false);
        map.addRoom(room1);




    }



}
