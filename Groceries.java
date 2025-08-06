public enum Groceries {
    CHEESE("Cheese",5),
    WATER("Water",3),
    OIL("Oil",10),
    SUGAR("Sugar",7);

    private String name;
    private int price;

    Groceries(String name, int price){
        this.name=name;
        this.price=price;
    }


}
