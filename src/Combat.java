import java.util.ArrayList;
import java.util.Random;

public class Combat {



    public int damagePointCalculator(int damagePoints){
        int updatedDamagePoints = 0;

        Random rand = new Random();
        int randInt = rand.nextInt(10);

        if(randInt == 10){
            updatedDamagePoints = damagePoints*2;

        }
        else{
            updatedDamagePoints = (damagePoints / 10) * randInt;

        }


        return updatedDamagePoints;
    }


    public int combat(int healthPoints, int targetHealthPoints, int damagePoints, int targetDamagePoints){

        int updatedDamagePoints = 0, updatedTargetDamagePoints = 0;
        System.out.println("\n_______________________________________________________________________________________________\n");

        while(healthPoints > 0 || targetHealthPoints > 0){
            updatedDamagePoints = damagePointCalculator(damagePoints);
            updatedTargetDamagePoints = damagePointCalculator(targetDamagePoints);
            System.out.println("You have struck the target for " + updatedDamagePoints);
            targetHealthPoints = targetHealthPoints - updatedDamagePoints;

            if(targetHealthPoints <= 0){
                System.out.println("The mob died. \n");
                break;
            }
            else{
                System.out.println("The target now has " + targetHealthPoints + " HP left!");
            }
            System.out.println("The target has struck you for " + updatedTargetDamagePoints);
            healthPoints = healthPoints - updatedTargetDamagePoints;
            if(healthPoints <= 0){
                System.out.println("You have died.\n");
                break;
            }
            else{
                System.out.println("You now have " + healthPoints + " HP left!");
            }
        }
        System.out.println("\n_______________________________________________________________________________________________\n");

        return healthPoints;
    }
}
