public enum Groceries {
    CHEESE("Cheese",5),
    WATER("Water",3),
    OIL("Oil",10),
    SUGAR("Sugar",7),
    APPLE("Apple",3);

    private final String name;
    private final int price;

    Groceries(String NAME, int PRICE){
        this.name = NAME;
        this.price =PRICE;
    }

    public int getPrice() {
        return price;
    }
}
