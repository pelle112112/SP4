public class Main {

    public static void main(String[] args) {

        int currentRoom = 1;
        UI ui = new UI();
        NPC startNPC = new NPC();
        NPC NPC2 = new NPC();
        DungeonLayout map = new DungeonLayout();

        ui.startMenu();
        Room entracne = new Room(0,false);
        map.addRoom(entracne);
        // Tutorial room med spider mob
        Room room1 = new Room(1, startNPC, true);
        map.addRoom(room1);
        // First room
        Room room2 = new Room(2,NPC2,false,true);
        map.addRoom(room2);
        Room room3 = new Room(3,true,false);
        map.addRoom(room3);
        //todo Vi skal have en boss i room 4 og skrive hvordan vi vil lave resten af rummene





    }



}
