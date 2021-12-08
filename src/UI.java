import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    DungeonLayout map;
    int combatCounter = 0;


    public void startMenu(){
        System.out.println("Welcome to DungeonCrawler!");
        System.out.println("To start a game press the following: \n");
        System.out.println("1. Start Game");
        System.out.println("2. Quit Game");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 1){
            //todo: start game
        }
        else if(input == 2){
            System.out.println("You have exited the program");
            System.exit(0);
        }
    }
    public int playerInteract(Room room, int index){
        Scanner scanner = new Scanner(System.in);
        int roomPrint = index-1;


        if(index == 0){
            System.out.println("You are in the entrance room! \n");
        }
        else if (index == 1){
            System.out.println("You are in the Tutorial room! \n");
        }
        else{
            System.out.println("You are in room " + roomPrint + "! \n");
        }
        System.out.println("What would you like to do? \n");
        if(room.Npc!=null){
            System.out.println("1. Interact with the NPC");
        }
        if(room.mobs!=null && combatCounter != 1){
            System.out.println("2. Attack the mob");
        }
        if(room.RoomItem != null){
            System.out.println("3. Read the Clue");
        }
        if(room.roomNorth != false){
            System.out.println("4. Go north into the next room");
        }
        if(room.roomSouth != false){
            System.out.println("5. Go south into the next room");
        }
        if(room.roomEast != false){
            System.out.println("6. Go East into the next room");
        }
        if(room.roomWest != false){
            System.out.println("7. Go West into the next room");
        }



        int input = scanner.nextInt();
        if(input == 2){
            combatCounter++;
        }
        //todo: Man skal kunne se hvilke rum man kan gå ind og ud af.

        return input;
    }

    public void NPCInteract(int index, int counter, ArrayList<Room> arrayList){
        map = new DungeonLayout();
        if(counter == 1){
            System.out.println("NPC: " + arrayList.get(index).Npc);
        }
        else if(counter == 2){
            System.out.println("NPC: " + arrayList.get(index).Npcv2);
        }




    }
    public void itemInteract(int index, Player player){
        if(map.rooms.get(index).item != null){
            player.inventory.addItemToInventory(map.rooms.get(index).item);
            System.out.println("you picked up "+ map.rooms.get(index).item);
        }
        if(player.inventory != null){
           if(player.inventory.items.contains(w))

            //System.out.println("9: Use "+ player.inventory.displayItems());
            //Scanner scanner = new Scanner(System.in);
            //int input = scanner.nextInt();
           // if(input == 9){
//player.inventory.removeItemFromInventory();

            }


        }


        //return player;
    ///}
    public void mobInteract(){

    }
    public void endMenu(){


    }
    public int enterRoom(int index, ArrayList<Room> arrayList, int direction, Player player){

        //north
        if(index == 0 && direction == 1){
            index++;
            return index;
        }
        //north
        if(index == 1 && direction == 1){
            if(player.inventory.items.size() == 0){
                System.out.println("Door is locked. Try to find/use a key");
            }
            for (int i = 0; i < player.inventory.items.size(); i++) {
                if(player.inventory.items.get(i) == arrayList.get(index).mobs.key){
                    index = 2;
                }
                else{
                    System.out.println("Door is locked. Try to find/use a key");
                }
            }
            return index;
        }
        //south
        else if(index == 1 && direction == 2){
            index--;
            return index;
        }
        //south
        if(index == 2 && direction == 2){
            index--;
            return index;
        }
        //west
        else if(index == 2 && direction == 4){
            index++;
            return index;
        }
        //east
        else if(index == 2 && direction == 3){
            index = index + 2;
            return index;
        }
        if(index == 3 && direction == 3){
            index--;
            return index;
        }
        if(index == 3 && direction == 4){

            for (int i = 0; i < player.inventory.items.size(); i++) {
                if(player.inventory.items.get(i) == arrayList.get(index).mobs.key){
                    index++;
                }
                else{
                    System.out.println("Door is locked. Try to find/use a key");
                }
            }
            return index;
        }
        if(index == 4 && direction == 1){
            for (int i = 0; i < player.inventory.items.size(); i++) {
                if(player.inventory.items.get(i) == arrayList.get(index).key){
                    System.out.println("TEST PRINT");
                    index++;
                }
                else{
                    System.out.println("Door is locked. Try to find/use a key");
                }
            }
            return index;
        }
        if(index == 4 && direction == 4){
            index = 2;
            return index;
        }
        if(index == 5 && direction == 1){
            index = 8;
            return index;
        }
        if(index == 5 && direction == 2){
            index--;
            return index;
        }
        if(index == 5 && direction == 3){
            index++;
            return index;
        }
        if(index == 6 && direction == 3){
            index++;
            return index;
        }
        if(index == 6 && direction == 4){
            index--;
            return index;
        }
        if(index == 7 && direction == 4){
            index--;
            return index;
        }
        if(index == 8 && direction == 1){
            index++;
            return index;
        }
        if(index == 8 && direction == 2){
            index--;
            return index;
        }


        return index;
    }
}
