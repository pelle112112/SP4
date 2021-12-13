public class Mobs {
    int healthPoints;
    int damagePoints;
    Item itemDrop;
    Key key;

    public Mobs(int healthPoints, int damagePoints){
        this.damagePoints=damagePoints;
        this.healthPoints=healthPoints;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Item itemDrop (){
        if (this.itemDrop != null && this.healthPoints <= 0){
            return key;
        }
        else {
            return key;
        }
    }
}
