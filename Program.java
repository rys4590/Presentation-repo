class Program{
    public static void fishOrNah(ProffesionalBasketballPlayer[] players){
        for (ProffesionalBasketballPlayer bsp : players){
            if(bsp instanceof Fish f)
                f.goToWork();
            bsp.playBasketball();
        }
    }


}