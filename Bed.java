public class  Bed {

    private double height;
    private int numPillows;
    private String sheetColor;

    public Bed(double height, int numPillows, String sheetColor){
        this.numPillows = numPillows;
        this.height = height;
        this.sheetColor = sheetColor;
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


}
