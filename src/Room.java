public class Room {
    int RoomID;
    Boolean chestOpened = false;
    Mobs mobs;
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
    String System4 = "System4";
    String clue = " ";
    String enemyTalk = "..";
    String enemyTalk2 = "";
    String enemyTalk3 = "";
    String playerTalk = "";
    String playerTalk2 = "";
    String  playerTalk3 = "";
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

    public void setSystem4(String system4){
        System3 = system4;
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
    public void setEnemyTalk2(String enemyTalk2) {
        this.enemyTalk2 = enemyTalk2;
    }

    public void setEnemyTalk3(String enemyTalk3) {
        this.enemyTalk3 = enemyTalk3;
    }

    public void setPlayerTalk(String playerTalk) {
        this.playerTalk = playerTalk;
    }
    public void setPlayerTalk2(String playerTalk2) {
        this.playerTalk2 = playerTalk2;
    }

    public void setPlayerTalk3(String playerTalk3) {
        this.playerTalk3 = playerTalk3;
    }
}

/*
"System: You have found a small blue key, you should try it out on that door right over there, its probably just scrap!\".\n"+"\t " +
                " You try ferociously to unlock the door, but with no success...","" +
                "The locked door requires a very large specific key looted from >The Imp-aler< who is said to be further inside the dungeon", key2room4);
 */