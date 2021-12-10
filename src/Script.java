public class Script {
    String text1 = "The princess has been kidnapped! You are our only hope to save her from The Goblin-King!\n" +
            "The king has promissed her marraige to whoever saves her\n" +
            "You have hid behind the other knights who have been defeated by the terrors of the dark\n" +
            "We dont believe you have what it takes, but we have no one left except you!\n" +
            "Go now! Show your worth and you will be rewarded!";
    String text2 = "System: \"You are in the trial room. You have the possibility to interact with\n" +
            "\t\t\tother NPCs,attack mobs/bosses and find clues/keys on the ground to advance\n" +
            "\t\t\tin the dungeon.\"\n" +
            "\t\n";
    String text40 = "NPC2:" +
            "I AM A KNIGHT! But that spider..... it terrifies me... Help me kill it and i will grant you my sword!";
    String text3= "System:"+ "You have found a key. Try and use it on that locked door over there!" + "\n";
    String text41 = "NPC2: \"Thanks for helping me out, but did I really need your help afterall? Well take my sword anyway and be gone!\n"
            +"After equipping your new sword, you have gained 20 more Damage Points!";;
    String text4= "System:\"+ \"You have unlocked the door to Room 1\"" ;
    String text5= "System:"+"This room rinks of bad smell, its covered in a black ooze of some kind, with green rot on the walls" ;
    String text6= "You have found a small blue key, you should try it out on that door right over there, its probably just scrap!\n" +
            "You try ferociously to unlock the door, but with no success...";
    String text7= "Clue\n:"+"The locked door requires a very large specific key looted from >The Imp-aler< who is said to be further inside the dungeon";
    String text8= "NPC3:\n" +
            "\t\"I dont know how to get through the door! Do you have the key required to open the lock?\" \n" +
            "\t\"I have searched everywhere insinde the room, but i have yet to find the key\"" ;
    String text9= "NPC3:\n" +
            "\t\"Thank you kind stranger for helping me get through the door\"\n" +
            "\t\"Here take this potion as a sign of my gratitude\"";
    String text10 = "NPC3 \"Oh my that's imp-ossible, i did not expect to meet <\"The Imp-aster\">\n" +
            "\tNPC3 \"I will help you take him down ";
    String text11 ="Two doors one goes up the other to the right ";
    String text12 = "NPC3 \"Oh well i ended up not being helpfull at all";
    String text13= " System: \"The boss dropped a note, you pick it up and begin to read it\"\n" +
            "\tSystem: Note:\"The princess has been captured while everyone was asleep, not a single soul awoke when we kidnapped her, since their food was filled with sleepingpills.\" \n" +
            "\t\t\"Exepct the princess, she had not eaten the drugged food and was lying silently in her bed. \"It was an easy task to catch her since no one could help \"";
    String text14= " tests";

    String text15= "Some random description, we will make it later";
    String text16= "You found a chest, open it?";
    String text17= "You opend the chest and found a Potion and an Armor." + "\n The armor is a little too small, however its better than the garbage clothing you are currently wearing";
    // room 7
    String text18= "System: \"You feel a horrifying auroa coming from the next room\"";
   // room 8
    String text19= "System: \"TURN ON THE GODDAM EPIC BOSS MUSIC KIDDO\"";
    String text20= "THE IMP-ALER \"IS THIS WHAT YOU ARE LOOKING FOR, ITS THE ONLY WAY TO GET TO THE PRINCESS KIDDO\"\n" +
            "\t** THE IMPALER holds up a giant black key.\n" +
            "\tTHE IMP-ALER \"I WILL IMP-ALE YOU WITH MY SPEAR AND EAT YOU FOR BREAKFAST\"";
    String text21= "\"WILHELM SCREAM\"\n" +
            "\t** THE IMP-ALER dies";
    String text22 = "\n" +
            "\tSystem: \"After you defeat the IMP-ALER you loot his corpse and take the giant black key\"\n" +
            "\tSystem: \"Use the key to unlock the last door and save the princess\"";
    // Room 9
    String text23 = "System: \"You open the door and gold start falling out of the room\"\"n";


    String text24 = "Goblin-King \"GET OUT OF MY DUNGEON YOU FILTHY PEASANT\"";
    String text25 = "Player:"+ "No i dont think i will";
    String text26 = "Goblin-King \"I WILL PERSONALLY CALL UPON THE IMP-ALER TO THROW YOU OUT OF MY DUNGEON AND EAT YOU ALIVE WHILE THE PRINCESS AND I WIL BE WATCHING\"";
    String text27 = "Player: \"But he is alreaddy dead\"";
    String text28 = "System: \"You throw the IMP-ALER's head infront of the Goblin-King";
    String text29 = "Goblin-King \"WHAT?? HOW IS THAT POSSBILE??\"";
    String text30 = "Player: \"Well that only leaves you...\"\n";
    String text31 = "SYSTEM: \"WHO DO YOU VOTE FOR TO WIN THE FINAL BATTLE? THE GRUSOME GOBLIN-KING OR THE SAVIOR OF THE WORLD THE PLAYER?\"\n" +
            "\t\t\"SEND YOU BETS TO X (MOBLIE PAY) NUMBER TO VOTE\" \n" +
            "\tSYSTEM: PLZ DONATE SOME MONEY TO US, WE ARE POOR\n" +
            "\tSYSTEM: \"FIGHT\"\n" +
            "\tSYSTEM: POKEMON RED/BLUE BATTLE THEME STARTS";
    String text32 = "System: \"You defeated the Goblin-king and returned to the kingdom with the princess\"\n" +
            "\t\t\"But she liked the Goblin-king more than you... Tough luck, and thus you did not marry her\"";

    //room descriptions
    String description1 = "A great entrance hall, full of light. A lonely soul stands in the corner scared for his life.";
    String description3 = "A dark moist corridor, cockroaches running from one wall to the next through the cracks.";
    String description5 = "pitch black, a single lantern casting off some light.";
    String description6 = "part of the ceiling has collapsed and is blocking the way.";
    String description7 = "an entrance of some sort, horrifying stench.";


    public void setText1() {
        this.text1 = "\\t\\\"The princess has been kidnapped! You are our only hope to save her from ___!\\\"\\n\" +\n" +
                "            \"\\t\\\"The king has promissed her marraige to whoever saves her\\\"\\n\" +\n" +
                "            \"\\t\\\"You have hid behind the other knights who have been defeated by the terrors of the dark\\\"\\n\" +\n" +
                "            \"\\t\\\"We dont believe you have what it takes, but we have no one left except you!\\\"\\n\" +\n" +
                "            \"\\t\\\"Go now! Show your worth and you will be rewarded!\\\"\";\n";
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }

    public String getText5() {
        return text5;
    }

    public String getText6() {
        return text6;
    }

    public String getText7() {
        return text7;
    }

    public String getText8() {
        return text8;
    }

    public String getText9() {
        return text9;
    }

    public String getText10() {
        return text10;
    }

    public String getText11() {
        return text11;
    }

    public String getText12() {
        return text12;
    }

    public String getText13() {
        return text13;
    }

    public String getText14() {
        return text14;
    }

    public String getText15() {
        return text15;
    }

    public String getText16() {
        return text16;
    }

    public String getText17() {
        return text17;
    }

    public String getText18() {
        return text18;
    }

    public String getText19() {
        return text19;
    }

    public String getText20() {
        return text20;
    }

    public String getText21() {
        return text21;
    }

    public String getText22() {
        return text22;
    }

    public String getText23() {
        return text23;
    }

    public String getText24() {
        return text24;
    }

    public String getText25() {
        return text25;
    }

    public String getText26() {
        return text26;
    }

    public String getText27() {
        return text27;
    }

    public String getText28() {
        return text28;
    }

    public String getText29() {
        return text29;
    }

    public String getText30() {
        return text30;
    }

    public String getText31() {
        return text31;
    }

    public String getText32() {
        return text32;
    }

    public String getText40(){return text40;}

    public String getText41(){return  text41;}

    public String getDescription1(){return  description1;}

    public String getDescription3(){return  description3;}

    public String getDescription5(){return  description5;}

    public String getDescription6(){return description6;}

    public String getDescription7(){return description7;}
}
