public enum Coin {
    SHEKEL( (amount) -> amount*0.3),
    DOLLAR(amount -> amount),
    EURO(amount->amount*1.15),
    ST(amount->amount+1);

    private ToDollar smth;

    Coin(ToDollar smth){
        this.smth = smth;
    }

    public double toDollar(int amount){
        return toDollar(amount);
    }

}
