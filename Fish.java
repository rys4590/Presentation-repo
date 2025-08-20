public abstract class Fish {
    protected int age;
    protected String favoriteFood;
    protected String name;

    public Fish(int age, String favoriteFood, String name){
        this.age=age;
        this.favoriteFood=favoriteFood;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void takeTheCar(){
        System.out.println("I am taking the car!");
    }

    public void walk(){
        System.out.println("I am walking!");
    }

    public void takeTheTrain(){
        System.out.println("I am taking the train!");
    }

    public abstract void goToWork();

}