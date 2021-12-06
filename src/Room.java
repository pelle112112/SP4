public class Room {
    int RoomID;
    DungeonObjects RoomItem;
    Mobs mobs;
    NPC npc;
    Item item;
    Boolean isDoorClosed = false;


    public Room(int roomID, DungeonObjects roomItem, Mobs mobs, NPC npc, Item item, Boolean door) {
        RoomID = roomID;
        RoomItem = roomItem;
        this.mobs = mobs;
        this.npc = npc;
        this.item = item;
        this.isDoorClosed = door;
    }

    public Room(int roomID, NPC npc, Boolean door) {
        RoomID = roomID;
        this.npc = npc;
        this.isDoorClosed = door;
    }
}
