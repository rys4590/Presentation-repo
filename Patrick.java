
public class Patrick extends Fish implements ProffesionalBasketballPlayer{

    public Patrick() {
        super(13, "CRABBY PATTY", "PATRICK");
    }

    @Override
    public void goToWork() {
        System.out.println("I dont have a job?");
        takeTheTrain();
    }

    @Override
    public void playBasketball() {
        System.out.println("I AM PLAYING BASKETBALL WITH SPONGEBOB");
    }

}
