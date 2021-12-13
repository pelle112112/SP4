import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    DungeonLayout map;
    //text color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //background color
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";



    public void startMenu(ArrayList<Room> rooms){
        System.out.println("Welcome to DungeonCrawler!");
        System.out.println("To start a game press the following: \n");
        System.out.println("1. Start Game");
        System.out.println("2. Quit Game");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 1){
            //todo: start game
            System.out.println("System: " + rooms.get(0).System);

        }
        else if(input == 2){
            System.out.println("You have exited the program");
            System.exit(0);
        }
    }
    public int playerInteract(Room room, int index, Player player, ArrayList<Room> rooms){
        Scanner scanner = new Scanner(System.in);
        int roomPrint = index-1;


        if(index == 0){
            System.out.println("You are in the entrance room! \n ");
        }
        else if (index == 1){
            System.out.println("You are in the Tutorial room! \n");
        }
        else{
            System.out.println("You are in room " + roomPrint + "! \n");
            System.out.println("You have " + ANSI_RED + player.PlayerHealthPoints + " HP" + ANSI_RESET);
        }
        System.out.println(ANSI_YELLOW + "What would you like to do? \n" + ANSI_RESET);
        if(room.Npc!= "NPC"){
            System.out.println("1. "+ANSI_BLUE+ "Interact with the NPC"+ANSI_RESET);
        }


            if (room.mobs != null && room.combatCounter == false) {
                System.out.println("2."+ANSI_BLUE+" Attack the mob"+ANSI_RESET);
            }



        if(index == 9 && room.combatCounter == true || index == 3){
            System.out.println("3."+ANSI_BLUE+" Read the Clue"+ANSI_RESET);
        }
        if(room.roomNorth != false){
            System.out.println("4."+ANSI_BLUE +" Go north into the next room"+ANSI_RESET);
        }
        if(room.roomSouth != false){
            System.out.println("5."+ANSI_BLUE+" Go south into the next room"+ANSI_RESET);
        }
        if(room.roomEast != false){
            System.out.println("6."+ANSI_BLUE +" Go East into the next room"+ ANSI_RESET);
        }
        if(room.roomWest != false){
            System.out.println("7."+ANSI_BLUE+" Go West into the next room"+ANSI_RESET);
        }
        if(player.inventory.items.contains(rooms.get(6).healthPot)){
            System.out.println("8."+ANSI_BLUE+" Use a healthPotion"+ANSI_RESET);
        }
        if(index == 7 && room.chestOpened == false){
            System.out.println("9."+ANSI_BLUE+" Open the chest"+ANSI_RESET);
        }
        if(index == 10 && room.combatCounter == false){
            System.out.println("10."+ANSI_BLUE+" Interact with the Goblin King"+ANSI_RESET);
        }
        if(index == 10 && room.combatCounter == true){
            System.out.println("11."+ANSI_BLUE+" Quit game"+ANSI_RESET);
        }
        System.out.println("\n\n");



        int input = scanner.nextInt();

        return input;
    }

    public void NPCInteract(int index, Room room, ArrayList<Room> arrayList) {
        map = new DungeonLayout();

        if (room.combatCounter == false) {
            System.out.println(arrayList.get(index).Npc);

        } else if (room.combatCounter == true) {
            System.out.println(arrayList.get(index).Npc2);
        }

    }

    public void mobInteract(){

    }
    public void endMenu(){


    }
    public int enterRoom(int index, ArrayList<Room> arrayList, int direction, Player player) throws Exception{


        if(index == 0 && direction == 1){
            index++;
        }


        else if (index == 1 && direction == 1) {
            if (player.inventory.items.size() == 0) {
                    System.out.println("Door is locked. Try to find/use a key");
                }
            for (int i = 0; i < player.inventory.items.size(); i++) {

                if (player.inventory.items.get(i) == arrayList.get(index).mobs.key) {
                        index = 2;
                    } else {
                        System.out.println("Door is locked. Try to find/use a key");
                    }
                }

        }

        else if(index == 1 && direction == 2){
            index--;

        }

        else if(index == 2 && direction == 2){
            index=1;

        }

        else if(index == 2 && direction == 4){
            index=3;

        }

        else if(index == 2 && direction == 3){
            index = 4;

        }
        else if(index == 3 && direction == 3){
            index = 2;

        }
        else if(index == 3 && direction == 4){
            for (int i = 0; i < player.inventory.items.size(); i++) {
                if(player.inventory.items.get(i) == arrayList.get(9).key){
                    index = 10;
                }
                else{
                    System.out.println("Door is locked. Try to find/use a key");
                }
            }

        }
        else if(index == 4 && direction == 1){
            for (int i = 0; i < player.inventory.items.size(); i++) {
                if(player.inventory.items.get(i) == arrayList.get(3).key){
                    index = 5;
                }
                else{
                    System.out.println("Door is locked. Try to find/use a key");
                }
            }

        }
        else if(index == 4 && direction == 4){
            index = 2;

        }
        else if(index == 5 && direction == 1){
            index = 8;

        }
        else if(index == 5 && direction == 2){
            index = 4;

        }
        else if(index == 5 && direction == 3){
            index = 6;

        }
        else if(index == 6 && direction == 3){
            index = 7;

        }
        else if(index == 6 && direction == 4){
            index = 5;

        }
        else if(index == 7 && direction == 4){
            index = 6;

        }
        else if(index == 8 && direction == 1){
            index++;

        }
        else if(index == 8 && direction == 2){
            index = 5;

        }
        else if(index == 9 && direction == 2){
            index = 8;

        }
        if(arrayList.get(index).combatCounter == false) {
            System.out.println(arrayList.get(index).System);
            if(index == 7){
                System.out.println(arrayList.get(7).System3);
            }
        }

        return index;
    }
}
