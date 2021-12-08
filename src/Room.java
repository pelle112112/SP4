public class Room {
    int RoomID;
    DungeonObjects RoomItem;
    Mobs mobs;
    Item item;
    Armor armor;
    Weapon weapon;
    HealthPot healthPot;
    Boolean combatCounter = false;
    Key key;
    String Npc = "NPC";
    String Npc2 = "NPC2";
    String System = "System";
    String System2 = "System2";
    String System3= "System3";
    String clue = "Clue";
    String enemyTalk = "..";
    Boolean roomNorth = false;
    Boolean roomSouth = false;
    Boolean roomEast = false;
    Boolean roomWest = false;




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

    public void setSystem(String system) {
        System = system;
    }

    public void setSystem2(String system2) {
        System2 = system2;
    }

    public void setSystem3(String system3){
        System3 = system3;
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

    public void setKey(Key key) {
        this.key = key;
    }

    public void setNpc2(String npc2) {
        this.Npc2 = npc2;
    }

    public void setEnemyTalk(String enemyTalk) {
        this.enemyTalk = enemyTalk;
    }
}

/*
"System: You have found a small blue key, you should try it out on that door right over there, its probably just scrap!\".\n"+"\t " +
                " You try ferociously to unlock the door, but with no success...","" +
                "The locked door requires a very large specific key looted from >The Imp-aler< who is said to be further inside the dungeon", key2room4);
 */