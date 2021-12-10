import java.nio.file.AtomicMoveNotSupportedException;
import java.util.ArrayList;

public class DungeonLayout {

    ArrayList<Room> rooms = new ArrayList();



    public void addRoom(Room room){
        rooms.add(room);
    }


    public ArrayList<Room> getRooms() {
        Script script = new Script();
        Room entrance = new Room(0);
        entrance.setSystem(script.text1);
        entrance.setRoomConnections(true, false, false, false);
        addRoom(entrance);

        // Tutorial room med spider mob
        Room tutorial = new Room(1);
        tutorial.setSystem(script.text2);
        tutorial.setSystem2(script.text3);
        tutorial.setNpc(script.text40);
        tutorial.setNpc2(script.text41);
        tutorial.setRoomConnections(true, true, false, false);
        Mobs spider = new Mobs(50,10);
        Key key1 = new Key("First key", "key", "key1");
        spider.setKey(key1);
        tutorial.addMob(spider);
        addRoom(tutorial);

        // First room
        Room room1 = new Room(2);
        room1.setSystem(script.text5);
        room1.setRoomConnections(false, false,true, true);
        addRoom(room1);


        // Second room
        Room room2 = new Room(3);
        Key key2 = new Key("Second Key", "Key", "key2");
        room2.setRoomConnections(false, false, true, true);
        room2.setKey(key2);
        room2.setSystem(script.text6);
        room2.setSystem2(script.text7);
        addRoom(room2);

        // Third room
        Room room3 = new Room(4);
        room3.setNpc(script.text8);
        room3.setNpc2(script.text9);
        room3.setRoomConnections(true, false, false, true);
        addRoom(room3);

        // Fourth room with a boss
        Mobs impOssible = new Mobs(70,25);
        Room room4 = new Room(5);
        room4.setRoomConnections(true, true, true, false);
        room4.setMobs(impOssible);
        room4.setNpc(script.text10);
        room4.setNpc2(script.text12);
        room4.setSystem2(script.text13);
        addRoom(room4);

        //Fifth room
        Room room5 = new Room(6);
        room5.setSystem(script.text15);
        room5.setRoomConnections(false, false, true, true);
        addRoom(room5);

        //Sixth Room
        Room room6 = new Room(7);
        room6.setRoomConnections(false, false, false, true);
        Armor armorpiece = new Armor("Semi-weak piece of armor", "Armor", "Leather gear");
        HealthPot healthPot1 = new HealthPot("Normal Healing Potion", "HealthPot", "HealthPot");
        room6.setSystem(script.text16);
        room6.setSystem2(script.text17);
        room6.setArmor(armorpiece);
        room6.setHealthPot(healthPot1);
        addRoom(room6);


        // Seventh Room
        Room room7= new Room(8);
        room7.setRoomConnections(true, true, false,false);
        room7.setSystem(script.text18);
        addRoom(room7);

        // Eighth room
        Room room8 = new Room(9);
        Key key3 = new Key("Large black key", "Key", "largeBlackKey");
        room8.setKey(key3);
        room8.setRoomConnections(false, true, false, false);
        room8.setSystem(script.text19);
        Mobs Imp_Aler = new Mobs(120,45);
        room8.setEnemyTalk(script.text20);
        room8.setMobs(Imp_Aler);
        room8.setSystem2(script.text21);
        room8.setSystem3(script.text22);
        addRoom(room8);

        // Ninth / final room
        Room room9 = new Room(10);
        Mobs Goblin_king = new Mobs(140,50);
        room9.setMobs(Goblin_king);
        room9.setSystem(script.text23);
        room9.setEnemyTalk(script.text24);
        room9.setPlayerTalk(script.text25);
        room9.setEnemyTalk2(script.text26);
        room9.setPlayerTalk2(script.text27);
        room9.setSystem2(script.text28);
        room9.setEnemyTalk3(script.text29);
        room9.setPlayerTalk3(script.text30);
        room9.setSystem3(script.text31);
        room9.setSystem4(script.text32);
        addRoom(room9);


        return rooms;
    }
}
