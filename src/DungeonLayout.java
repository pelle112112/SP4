import java.nio.file.AtomicMoveNotSupportedException;
import java.util.ArrayList;

public class DungeonLayout {

    ArrayList<Room> rooms = new ArrayList();



    public void addRoom(Room room){
        rooms.add(room);
    }


    public ArrayList<Room> getRooms() {
        Script script = new Script();
        Room entrance = new Room(0,false,script.text1, script.text2);
        entrance.setRoomConnections(true, false, false, false);
        addRoom(entrance);

        // Tutorial room med spider mob
        Room tutorial = new Room(1,true,script.text2, script.text3);
        tutorial.setRoomConnections(true, true, false, false);
        Mobs spider = new Mobs(50,10);
        Key key1 = new Key("First key", "key", "key1");
        spider.setKey(key1);
        tutorial.addMob(spider);
        addRoom(tutorial);

        // First room
        Room room1 = new Room(2,script.text5);
        room1.setRoomConnections(false, false,true, true);
        addRoom(room1);
        Key key2 = new Key("Second Key", "Key", "key2");

        // Second room
        Room room2 = new Room(3,script.text7,script.text8,key2);
        room2.setRoomConnections(false, false, true, true);
        addRoom(room2);

        // Third room
        Room room3 = new Room(4,script.text8,script.text9);
        room3.setRoomConnections(true, false, false, true);
        addRoom(room3);

        // Fourth room with a boss
        Mobs impOssible = new Mobs(70, 15);
        Room room4 = new Room(5);
        room4.setRoomConnections(true, true, true, false);
        room4.setMobs(impOssible);
        room4.setSystem(script.text11);
        room4.setNpc(script.text10);
        room4.setNpcv2(script.text12);
        room4.setSystem2(script.text13);
        addRoom(room4);

        //Fifth room
        Room room5 = new Room(6);
        room5.setSystem(script.text15);
        room5.setRoomConnections(false, false, true, true);

        //Sixth Room
        Room room6 = new Room(7);
        Armor armorpiece = new Armor("Semi-weak piece of armor", "Armor", "Leather gear");
        HealthPot healthPot1 = new HealthPot("Normal Healing Potion", "HealthPot", "HealthPot");
        room6.setSystem(script.text16);
        room6.setSystem2(script.text17);
        room6.setArmor(armorpiece);
        room6.setHealthPot(healthPot1);


        // Sevent Room
        Room room7= new Room(8);
        room7.setSystem(script.text18);
        addRoom(room7);

        // Eighth room
      //  Room room8 = new Room(9);
      //  room8.setSystem(script.text19);
      //  Mobs Imp_Aler = new Mobs(100,30);
      //  room8.setMobs(script.text20);


        //todo Vi skal have en boss i room 4 og skrive hvordan vi vil lave resten af rummene dvs.
        // hvilke slags monstre og NPC's der skal være tilstede i rummene


        return rooms;
    }
}
