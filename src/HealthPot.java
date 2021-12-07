public class HealthPot extends Item{

    int potency = 30;

    public HealthPot(String itemDescription, String itemType, String itemName) {
        super(itemDescription, itemType, itemName);

    }

        public int useHealthPot(int playerHealth){
            playerHealth=playerHealth+potency;
        return playerHealth;
        }


}
