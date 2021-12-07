public class HealthPot extends Item{
    int playerHealth;
    int potency = 30;

    public HealthPot(String itemDescription, String itemType, String itemName, int playerHealth) {
        super(itemDescription, itemType, itemName);
        this.playerHealth = playerHealth;
    }

        public int HealthPotCalculator(){
            return playerHealth+potency;
        }

}
