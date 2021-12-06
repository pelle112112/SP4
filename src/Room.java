public class Room {
    int RoomID;
    DungeonObjects RoomItem;
    Mobs mobs;
    NPC npc;
    Item item;
    Boolean isDoorClosed = false;
    Boolean isDoor2Closed = false;


    public Room(int roomID, DungeonObjects roomItem, Mobs mobs, NPC npc, Item item, Boolean door) {
        RoomID = roomID;
        RoomItem = roomItem;
        this.mobs = mobs;
        this.npc = npc;
        this.item = item;
        this.isDoorClosed = door;
    }

    public Room(int roomID, Boolean door) {
        RoomID = roomID;
        this.isDoorClosed = door;
    }

    public Room(int roomID, NPC npc, Boolean door) {
        RoomID = roomID;
        this.npc = npc;
        this.isDoorClosed = door;
    }

    public Room(int roomID, NPC npc, Boolean door, Boolean door2) {
        RoomID = roomID;
        this.npc = npc;
        this.isDoorClosed = door;
        this.isDoor2Closed = door2;
    }

    public Room(int roomID, Boolean door, Boolean door2) {
        RoomID = roomID;
        this.isDoorClosed = door;
        this.isDoor2Closed = door2;
    }
}
