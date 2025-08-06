public class Closet {
    private Shirt[] shirts;

    public Closet(Shirt[] shirts){
        this.shirts = shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public Shirt[] returnBySize(int size){
        int count = 0;
        for (int i = 0; i < shirts.length; i++) {
            if(shirts[i].getSize()==size)
                count++;
        }
        Shirt[] byRequest = new Shirt[count];
        int j = 0;
        for (int i = 0; i < shirts.length; i++) {
            if(shirts[i].getSize()==size){
                byRequest[j] = new Shirt(shirts[i].getSize(), shirts[i].getColor());
                j++;
            }
        }
        return byRequest;
    }
}
