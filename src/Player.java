public class Player {
    int PlayerHealthPoints;
    int PlayerDamagePoints;
    int CurrentHealthPoints;
    Inventory inventory;
    Item itemEquipped;


    public Player(int playerHealthPoints, int playerDamagePoints, Inventory inventory) {
        PlayerHealthPoints = playerHealthPoints;
        PlayerDamagePoints = playerDamagePoints;
        this.inventory = inventory;
    }

    public void setPlayerHealthPoints(int playerHealthPoints) {
        PlayerHealthPoints = playerHealthPoints;
    }

    public void armorHPIncreaser(){
        System.out.println("After equipping your new piece of armor, you have gained 50 more Max HP!");
        this.PlayerHealthPoints = this.PlayerHealthPoints + 50;
    }
    public void damageIncreaser(){
        System.out.println("After equipping your new sword, you have gained 20 more Damage Points!");
        this.PlayerDamagePoints = this.PlayerDamagePoints + 20;
    }
    public void useHealthPotion (){
        this.PlayerHealthPoints = PlayerHealthPoints + 50;

        System.out.println("The HealthPot has healed you for 50 HP! You now have " + PlayerHealthPoints + " HP!");
    }
}
