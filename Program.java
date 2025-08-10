public class Program {
    public static void  error(){
         new RuntimeException("my message A");
        Exception index = new  IndexOutOfBoundsException("my message B");
        index.getStackTrace();
        throw new RuntimeException();
    }

    public static void letsCauseAnError(){
        int x = 0;
        int y = 5;
        int z = y/x;
    }

}
