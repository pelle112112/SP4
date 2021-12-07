public class Mobs {
    int healthPoints;
    int damagePoints;
    Item itemDrop;

    public Mobs(int healthPoints, int damagePoints){
        this.damagePoints=damagePoints;
        this.healthPoints=healthPoints;
    }

    public Item itemDrop (){
        if (this.itemDrop != null && this.healthPoints <= 0){
            return itemDrop;
        }
        else {
            return null;
        }
    }
}
