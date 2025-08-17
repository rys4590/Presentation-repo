
public record Student(String name,int grade, int classNum){

    public Student(int classNum, String name){
        this(name,9,classNum);
    }

    public boolean isHighSchool(){
        return(this.grade>9);
    }

    public String toString(){
        return "grade:"+this.grade+" name:"+this.name()+" classNumber:" + this.classNum;
    }

}

