import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;
import java.util.IllegalFormatException;
import java.util.Scanner;
public class Program {
    public static Scanner input = new Scanner(System.in);
    public static void  error(){
         new RuntimeException("my message A");
        Exception index = new  IndexOutOfBoundsException("my message B");
        index.getMessage();
        throw new RuntimeException();
    }

    public static void trying() {
        try{
            int x = 0;
            int y = 5;
            int z = y / x;
        }
        catch(Exception e){
            System.out.println("error"+ e.getMessage());
        }
    }

    public static void question3(){
        int num;
        for (int i = 0; i > -1; i++) {
            System.out.println("enter num");
            num = input.nextInt();
            if(num==45)
                illegalEcx();
            else if(num==100)
                exeptionRuntime();
        }
    }

    public static void exeptionRuntime(){
        throw new RuntimeException("you entered 100");
    }

    public static void illegalEcx(){
        throw new IllegalArgumentException("you entered 45");
    }

    public static void question4(int integer) throws FileNotFoundException, BindException, AuthenticationException {
        if (integer == 1)
            throw new FileNotFoundException("YO!");
        if (integer == 2)
            throw new BindException();
        if (integer == 3)
            throw new AuthenticationException();
    }

    public static void question5(int parameter){
        try {
            question4(parameter);
        }
        catch(FileNotFoundException e){
            System.out.println(1);
        }
        catch(BindException e){
            System.out.println(2);
        }
        catch(AuthenticationException e){
            System.out.println(3);
        }
    }
    public static void main (String[]args){

    }
}
