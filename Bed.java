public class Bed {

    private static final double FIN_PRICE=100;
    private double price;
    private double height;
    private int numPillows;
    private String sheetColor;


    public Bed(double height, int numPillows, String sheetColor, double price){
        this.numPillows = numPillows;
        this.height = height;
        this.sheetColor = sheetColor;
        this.price=price;
    }

    public Bed(double height, String sheetColor){
        this(height,1,sheetColor,FIN_PRICE);

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
