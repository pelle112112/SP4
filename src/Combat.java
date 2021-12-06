import java.util.ArrayList;

public class Combat {
    ArrayList combatHPArray = new ArrayList();

    public ArrayList combatCalculator(int playerHealthPoints, int playerDamagePoints, int targetHealthPoints, int targetDamagePoints){
        combatHPArray.clear();
        int playerHealthPointsLost = 0, targetHealthPointsLost = 0;
        playerHealthPointsLost = playerHealthPoints - targetDamagePoints;
        targetHealthPointsLost = targetHealthPoints - playerDamagePoints;
        playerHealthPoints = playerHealthPoints - targetDamagePoints;
        targetHealthPoints = targetHealthPoints - playerDamagePoints;
        System.out.println("During combat the player lost " + playerHealthPointsLost + " HP, and now has " + playerHealthPoints);
        System.out.println("The target lost " + targetHealthPointsLost + " HP, and now has " + targetHealthPoints);
        combatHPArray.add(playerHealthPoints);
        combatHPArray.add(targetHealthPoints);

        return combatHPArray;
    }

}
