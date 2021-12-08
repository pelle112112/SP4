public class Player {
    int PlayerHealthPoints = 100;
    int PlayerDamagePoints = 30;
    int CurrentHealthPoints;
    Inventory inventory;
    Item itemEquipped;


    public Player(int playerHealthPoints, int playerDamagePoints, Inventory inventory) {
        PlayerHealthPoints = playerHealthPoints;
        PlayerDamagePoints = playerDamagePoints;
        this.inventory = inventory;
    }

    public void armorHPIncreaser(){
        this.PlayerHealthPoints = this.PlayerHealthPoints + 20;
    }
    public void damageIncreaser(){
        this.PlayerDamagePoints = this.PlayerDamagePoints + 20;
    }
}
