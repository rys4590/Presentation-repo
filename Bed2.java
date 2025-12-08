public class Bed2 {
    private double height;
    private int numOfPillows;
    private String colorOfSheets;
    private int price;

    public Bed2(double height, int numOfPillows, String colorOfSheets, String color0fSheets2){
        this.height = height;
        this.colorOfSheets = colorOfSheets;
        this.numOfPillows =1;
        this.price =100;

    }

    public void setColorOfSheets(String colorOfSheets) {
        this.colorOfSheets=colorOfSheets;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setNumOfPillows(int numOfPillows) {
        this.numOfPillows = numOfPillows;
    }

    public double getHeight() {
        return height;
    }

    public int getNumOfPillows() {
        return numOfPillows;
    }

    public String getColorOfSheets() {
        return colorOfSheets;
    }
    public int getPrice(price=100) {
        return price;
    }
}
