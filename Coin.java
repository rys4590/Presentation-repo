public enum Coin {
    SHEKEL( (amount) -> amount*0.3),
    DOLLAR(amount ->),
    EURO(new String()),
    ST(1);

    private ToDollar smth;

    Coin(ToDollar smth){
        this.smth = smth;
    }

}
