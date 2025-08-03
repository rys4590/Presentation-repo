public class Student {
    public record student(String name,int grade, int classNum){
        public boolean isHighSchool(){
            return(this.grade>9);
        }

        public String toString(){
            return "grade:"+this.grade+" name:"+this.name()+" classNumber:" + this.classNum;
        }

        public Student(int grade, String name){
            this.name =
        }
    }
}
