class Program{
    public static void fishOrNah(ProffesionalBasketballPlayer[] players){
        for (ProffesionalBasketballPlayer bsp : players){
            if(bsp instanceof Fish f)
                f.goToWork();
            bsp.playBasketball();
        }
    }

    public static void basketballFish(Fish[] fishes) {
        int countBasketballPlayers = 0;
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i] instanceof ProffesionalBasketballPlayer fbp)
                countBasketballPlayers++;
        }
        ProffesionalBasketballPlayer[] ProfBaskFish = new ProffesionalBasketballPlayer[countBasketballPlayers];
        int j = 0
        for (int i = 0; i < fishes.length; i++) {
            if (fishes[i] instanceof ProffesionalBasketballPlayer fbp) {
                ProfBaskFish[j] = fbp;
                j++;
            }
        }
    }
}