public enum Groceries {
    CHEESE("Cheese",5),
    WATER("Water",3),
    OIL("Oil",10),
    SUGAR("Sugar",7),
    APPLE("Apple",3);

    private final String NAME;
    private final int PRICE;

    Groceries(String NAME, int PRICE){
        this.NAME= NAME;
        this.PRICE=PRICE;
    }

    public int getPrice() {
        return PRICE;
    }
}
