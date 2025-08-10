import java.sql.SQLOutput;

public class Patrick extends Fish implements ProffesionalBasketballPlayer{
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
