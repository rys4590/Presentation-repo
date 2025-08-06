public class Program {

    public static int previousDays(Month month, int day){
        Month[] arr = month.values();
        int sum=0;
        for (int i = 1; i < month.returnNum() ; i++) {
            sum+=arr[i-1].getDays();
        }
        sum+= arr[month.returnNum()].getDays()-day;
        return sum;  //not sure about this one at all, but ill check at the end
    }
}
