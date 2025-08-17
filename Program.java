import java.util.function.IntFunction;

public class Program{
    public static boolean isCharInString(char ch,String text) {
        boolean isIn = false;
        for (int i = 0; i < text.length() || isIn; i++) {
            isIn = (text.charAt(i) == ch);
        }
        return isIn;
    }

    public static int raiseByLargeNum(int n1, int n2){
        int max;
        int min;
        if(n1>n2){
            max = n2;
            min = n1;
        }
        else{
            max = n1;
            min = n2;
        }
        return (int) Math.pow(min, max);
    }

    public static int gettingInt(int smth){
        return smth;
    }

    public static int returningInt(GetInt num, int n){
        return num.gettingInt(n);
    }

    public static void main(String[] args) {
        CharInString i = Program::isCharInString;
//        RaiseByLargeNum smth = Program::raiseByLargeNum;
        ToDollar smth = ( amount) -> amount*0.3;
    }


}
