public class MrCrab extends Fish{
    @Override
    public void goToWork() {
        System.out.println("IM GONNA EARN MONEY!!!");
        takeTheCar();
    }

    public MrCrab() {
        this.age = 13;
        this.favoriteFood = "MONAYYYY";
        this.name="MRCRAB";
    }
}
