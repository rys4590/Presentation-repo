public enum Month {

    JANUARY("January", 31),
    FEBRUARY("February" ,28),
    MARCH("March",31),
    APRIL("April",30),
    MAY("May", 31),
    JUNE("June", 30),
    JULY("July", 31),
    AUGUST("August",31),
    SEPTEMBER("September",30),
    OCTOBER("October", 31),
    NOVEMBER("November",30),
    DECEMBER("December",31);

    private String month;
    private int days;

     Month(String month, int days){
        this.month=month;
        this.days=days;
    }
    public int returnNum(){
         return (ordinal()+1);
    }

    public int getDays() {
        return days;
    }

    public String getMonth() {
        return month;
    }
}
