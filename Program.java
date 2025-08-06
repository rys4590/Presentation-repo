import java.util.Scanner;

public class Program {
    public static Scanner imput = new Scanner(System.in);
    public static int previousDays(Month month, int day){
        Month[] arr = Month.values();
        int sum=0;
        for (int i = 1; i < month.returnNum() ; i++) {
            sum+=arr[i-1].getDays();
        }
        sum+= arr[month.returnNum()].getDays()-day;
        return sum;  //not sure about this one at all, but ill check at the end
    }

    public static Month whichMonth(int day){
        Month[] arr = Month.values();
        int sum=0;
        int i = 0;
        while(sum!=day){
            sum+=arr[i].getDays();
            i++;
        }
        i--;
        return arr[i];
    }

    public static int recipt(Groceries[] groceriesList, int[] amount){
        int sum=0;
        for (int i = 0; i < groceriesList.length; i++) {
            sum+=groceriesList[i].getPrice()*amount[i];
        }
        return sum;
    }

}
