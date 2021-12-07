public class Room {
    int RoomID;
    DungeonObjects RoomItem;
    Mobs mobs;
    NPC npc;
    Item item;
    Boolean isDoorClosed = false;
    Boolean isDoor2Closed = false;
    String Npc = "NPC";
    String Npcv2 = "NPCV2";
    String System = "System";
    String System2 = "System2";
    String clue = "Clue";

    //
    public Room(int roomID, DungeonObjects roomItem, Mobs mobs, NPC npc, Item item, Boolean door) {
        RoomID = roomID;
        RoomItem = roomItem;
        this.mobs = mobs;
        this.npc = npc;
        this.item = item;
        this.isDoorClosed = door;
    }
    // TUTORIAL ROOM
    public Room(int roomID, Boolean door, String NPC) {
        RoomID = roomID;
        this.isDoorClosed = door;
        this.Npc = NPC;
    }
    // TUTORIAL ROOM 2
    public Room(int roomID,String SYSTEM,String NPC, String SYSTEM2){
        RoomID=roomID;
        this.System = SYSTEM;
        this.Npc= NPC;
        this.System2=SYSTEM2;
    }

    //ROOM 1
    public Room(int roomID, String SYSTEM, Boolean door, Boolean door2) {
        RoomID = roomID;
        this.System = SYSTEM;
        this.isDoorClosed = door;
        this.isDoor2Closed = door2;
    }

    //ROOM 2
    public Room(int roomID,Boolean door, Boolean door2,String SYSTEM,String Clue, DungeonObjects key2room4){
        RoomID=roomID;
        this.isDoorClosed=door;
        this.isDoor2Closed=door2;
        this.System = SYSTEM;
        this.clue= Clue;
        RoomItem = key2room4;
    }

    // ROOM 3
    public Room (int roomID,Boolean door, Boolean door2,String NPC, String SYSTEM, String NPCV2){
        RoomID=roomID;
        this.isDoorClosed= door;
        this.isDoor2Closed=door2;
        this.Npc= NPC;
        this.System = SYSTEM;
        this.Npcv2 = NPCV2;
    }

    //public Room(int roomID, String NPC, Boolean door,Mobs mobs) {
    //    RoomID = roomID;
    //    this.Npc = NPC;
    //    this.isDoorClosed = door;
    //    this.mobs = mobs;
   // }
}
