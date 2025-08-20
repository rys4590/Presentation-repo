public enum Coin {
    SHEKEL(0.3 ), //second is how much to dollar
    DOLLAR(1),
    ST(1),
    EURO(1.15);

    private double toTimes;


    Coin( double toTimes){
        this.toTimes=toTimes;
    }

    double toDollar(Coin coin, double amount){
        return amount * coin.getToTimes();
    }


    public double getToTimes() {
        return toTimes;
    }


}