public class Person {
    double age;
    double height;

    double weight;
    boolean isMale;

    public Person(double age, double height, boolean isMale,double weight){
        this.age =age;
        this.height=height;
        this.isMale=isMale;
        this.weight=weight;
    }

    public void setWeight(double weight){
        if(weight>0)
            this.weight = weight;
    }
}
