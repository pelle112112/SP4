public class Player {
    int PlayerHealthPoints = 100;
    int PlayerDamagePoints;
    int CurrentHealthPoints;
    Inventory inventory;
    Item itemEquipped;



    public Player(int playerHealthPoints, int playerdamagePoints, Inventory inventory, Item itemEquipped) {
        PlayerHealthPoints = playerHealthPoints;
        PlayerDamagePoints = playerdamagePoints;
        this.inventory = inventory;
        this.itemEquipped = itemEquipped;
    }
}