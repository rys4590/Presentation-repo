
public record Student(String name,int grade, int classNum){
private static final int AT_HIGH =9;
    public Student(int classNum, String name){
        this(name, AT_HIGH,classNum);
    }

    public boolean isHighSchool(){
        return(this.grade>AT_HIGH);
    }

    public String toString(){
        return "grade:"+this.grade+" name:"+this.name()+" classNumber:" + this.classNum;
    }

}

