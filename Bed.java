public class Bed {

    private final double BED_HEIGHT;
    private int numPillows;
    private String sheetColor;

    public Bed(double height, int numPillows, String sheetColor){
        this.numPillows = numPillows;
        this.BED_HEIGHT = height;
        this.sheetColor = sheetColor;
    }

    public double getHeight() {
        return BED_HEIGHT;
    }

    public int getNumPillows() {
        return numPillows;
    }

    public String getSheetColor() {
        return sheetColor;
    }


}
