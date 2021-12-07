import java.util.Scanner;

public class UI {
    DungeonLayout map;


    public void startMenu(){
        System.out.println("Welcome to DungeonCrawler!");
        System.out.println("To start a game press the following: \n");
        System.out.println("1. Start Game");
        System.out.println("2. Quit Game");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 1){
            System.out.println("Good luck inside the dungeon");
            //todo: start game
        }
        else if(input == 2){
            System.out.println("You have exited the program");
            System.exit(0);
        }
    }
    public int playerInteract(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("What would you like to do?");
        //IF THERES AN NPC
        System.out.println("1. Interact with the NPC");
        //IF THERES A MOB
        System.out.println("2. Attack the mob");
        //IF THERES A CLUE
        System.out.println("3. Read the Clue");

        int input = scanner.nextInt();
        //todo: Man skal kunne se hvilke rum man kan gå ind og ud af.

        return input;
    }

    public void NPCInteract(){

    }
    public void itemInteract(){

    }
    public void mobInteract(){

    }
    public void endMenu(){

    }
    public void enterRoom(int currentRoom){
        System.out.println("You are in room " + currentRoom + "!");
        System.out.println("");
    }
}
