import java.util.Scanner;

public class Program {

    public static Scanner input = new Scanner(System.in);

    public static void question1(int[] arr){
        int small = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i+=2) {
            if(arr[i]<small)
                small = arr[i];
        }
        System.out.println(small);
        for (int i = 0; i <arr.length-1-i/2 ; i+=2) {

        }
    }

    public static void main(String[] args){

    }
}
