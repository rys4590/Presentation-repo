public class Spongebob extends Fish implements ProffesionalBasketballPlayer{
    public Spongebob() {
        this.age = 13;
        this.favoriteFood = "BURGER";
        this.name="SPONGEBOB";
    }

    @Override
    public void goToWork() {
        System.out.println("YEPPEEE YAY IM GOING TO WORK!!");
        walk();
    }

    @Override
    public void playBasketball() {
        System.out.println("PLAYIN WITH PATRICK");
    }
}
