public class Bed {

    private double height;
    private int numPillows;
    private String sheetColor;
    private double price;


    public Bed(double height, int numPillows, String sheetColor, double price){
        this.numPillows = numPillows;
        this.height = height;
        this.sheetColor = sheetColor;
        this.price=price;
    }

    public Bed(double height, String sheetColor,double price){
        this(height,1,sheetColor,price);

    }

    public double getHeight() {
        return height;
    }

    public int getNumPillows() {
        return numPillows;
    }

    public String getSheetColor() {
        return sheetColor;
    }


    public void setSheetColor(String sheetColor) {
        this.sheetColor = sheetColor;
    }

}
