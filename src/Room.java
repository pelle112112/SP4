public class Room {
    int RoomID;
    DungeonObjects RoomItem;
    Mobs mobs;
    NPC npc;
    Item item;
    Armor armor;
    Weapon weapon;
    HealthPot healthPot;
    Key key;
    Boolean isDoorClosed = false;
    Boolean isDoor2Closed = false;
    String Npc = "NPC";
    String Npcv2 = "NPCV2";
    String System = "System";
    String System2 = "System2";
    String clue = "Clue";
    Boolean roomNorth = false;
    Boolean roomSouth = false;
    Boolean roomEast = false;
    Boolean roomWest = false;

    //
    public Room(int roomID, DungeonObjects roomItem, Mobs mobs, NPC npc, Item item, Boolean door) {
        RoomID = roomID;
        RoomItem = roomItem;
        this.mobs = mobs;
        this.npc = npc;
        this.item = item;
        this.isDoorClosed = door;
    }
    // TUTORIAL ROOM ROOM ID 1
    public Room(int roomID, Boolean door, String NPC, String npcv2) {
        RoomID = roomID;
        this.isDoorClosed = door;
        this.Npc = NPC;
        this.Npcv2 = npcv2;
    }
    // TUTORIAL ROOM 2
    public Room(int roomID,String SYSTEM,String NPC, String SYSTEM2,boolean door){
        RoomID=roomID;
        this.System = SYSTEM;
        this.Npc= NPC;
        this.System2=SYSTEM2;
        this.isDoorClosed=door;
    }

    //ROOM 1 ROOM ID 2
    public Room(int roomID, String SYSTEM) {
        RoomID = roomID;
        this.System = SYSTEM;
    }

    //ROOM 2 ROOM ID 3
    public Room(int roomID,String SYSTEM,String Clue, Key KEY){
        RoomID=roomID;
        this.System = SYSTEM;
        this.clue= Clue;
        this.key = KEY;
    }



    // ROOM 3 ROOM ID 4
    public Room (int roomID,String NPC, String NPCV2){
        RoomID=roomID;
        this.Npc= NPC;
        this.Npcv2 = NPCV2;
    }

    public Room (int roomID){
        RoomID=roomID;
    }

    public void setRoomConnections(Boolean North, Boolean South, Boolean East, Boolean West){
        this.roomNorth = North;
        this.roomSouth = South;
        this.roomEast = East;
        this.roomWest = West;
    }
    public void addMob(Mobs mobs){
        this.mobs = mobs;
    }

    public void setNpc(String npc) {
        Npc = npc;
    }

    public void setNpcv2(String npcv2) {
        Npcv2 = npcv2;
    }

    public void setSystem(String system) {
        System = system;
    }

    public void setSystem2(String system2) {
        System2 = system2;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public void setMobs(Mobs mobs) {
        this.mobs = mobs;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setHealthPot(HealthPot healthPot) {
        this.healthPot = healthPot;
    }
}

/*
"System: You have found a small blue key, you should try it out on that door right over there, its probably just scrap!\".\n"+"\t " +
                " You try ferociously to unlock the door, but with no success...","" +
                "The locked door requires a very large specific key looted from >The Imp-aler< who is said to be further inside the dungeon", key2room4);
 */