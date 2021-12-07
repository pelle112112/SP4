import java.util.ArrayList;

public class DungeonLayout {

    ArrayList<Room> rooms = new ArrayList();


    public void addRoom(Room room){
        rooms.add(room);
    }


    public ArrayList<Room> getRooms() {
        Room entrance = new Room(0,false,"\"\\t\\\"The princess has been kidnapped! You are our only hope to save her from ___!\\\"\\n\" +\n" +
                "            \"\\t\\\"The king has promissed her marraige to whoever saves her\\\"\\n\" +\n" +
                "            \"\\t\\\"You have hid behind the other knights who have been defeated by the terrors of the dark\\\"\\n\" +\n" +
                "            \"\\t\\\"We dont believe you have what it takes, but we have no one left except you!\\\"\\n\" +\n" +
                "            \"\\t\\\"Go now! Show your worth and you will be rewarded!\\\"\";\n");
        addRoom(entrance);
        // Tutorial room med spider mob
        Room tutorial = new Room(1,true,"System: \"You are in the trial room. You have the possibility to interact with\n" +
                "\t\t\tother NPCs, attack mobs/bosses and find clues/keys on the ground to advance\n" +
                "\t\t\tin the dungeon.\"\n" +
                "\t\n" +
                "\tNPC2:\n" +
                "\t\"I AM A KNIGHT! But that spider..... it terrifies me... Help me kill it and i will grant you my sword!\"\n" +
                "\t\t\n");
        addRoom(tutorial);
        // after combat
        Room tutorial2 = new Room(1,"System: \"You have found a key. Try and use it on that locked door over there!\"","NPC2:Thanks for helping me out, but did I really need your help afterall? Well take my sword anyway and be gone!","System: \"You have unlocked the door to Room 1\"");
        addRoom(tutorial2);
        // First room
        Room room1 = new Room(2,"System: \"This room rinks of bad smell, its covered in a black ooze of some kind, with green rot on the walls\".\n" +
                "\t",false,true);
        addRoom(room1);
        Room room2 = new Room(3,false,true,"System: \"You have found a small blue key, you should try it out on that door right over there, its probably just scrap!\"\n" +
                "\t\n" +
                "\t\tYou try ferociously to unlock the door, but with no success...","Clue: \"The locked door requires a very large specific key looted from >The Imp-aler< who is said to be further inside the dungeon\"",);
        addRoom(room2);
        //todo Vi skal have en boss i room 4 og skrive hvordan vi vil lave resten af rummene dvs.
        // hvilke slags monstre og NPC's der skal være tilstede i rummene


        return rooms;
    }
}
