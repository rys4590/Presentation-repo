public class Util {
    protected static Shirt[]  addToArray(Shirt shirt, Shirt[] shirts){
        Shirt[] newShirts = new Shirt[shirts.length+1];
        for (int i = 0; i < shirts.length; i++) {
            newShirts[i]=shirts[i];
        }
        newShirts[shirts.length] = shirt;
        return  newShirts;
    }
}
