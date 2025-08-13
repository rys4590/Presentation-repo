
public class Program{
    public static boolean isCharInString(char ch,String text) {
        boolean isIn = false;
        for (int i = 0; i < text.length() || isIn; i++) {
            isIn = (text.charAt(i) == ch);
        }
        return isIn;
    }

    public static void main(String[] args) {
        CharInString i = Program::isCharInString;
    }

}
