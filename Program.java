import javax.crypto.spec.PSource;

public class Program {

    public static void executeStudent(){
        Student Ronnie = new Student("Ronnie",9,5);
        System.out.println(Ronnie);
        if(Ronnie.isHighSchool())
            System.out.println("Ronnie is in highschool!");
        else
            System.out.println("Ronnie ain't in highschool just yet");
    }

    public static void main(String[] args){
        int x = 5;
        int y = x;
        x=2;
        System.out.println(x);
        System.out.println(y);
    }
}
