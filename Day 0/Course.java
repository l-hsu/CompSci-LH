public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents){
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName){
        this(courseName, new StudentRecord[0]);
    }

    public String getCourseName(){
        return this.courseName;
    }
    public StudentRecord[] getEnrolledStudents(){
        return this.enrolledStudents;
    }
    public String toString(){
        String result = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            result += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return result;
    }

public String findBestStudent(){
    int index = 0;
    for (int i = 0; i < enrolledStudents.length; i ++){
        if (enrolledStudents[i].getFinalAverage() > enrolledStudents[index].getFinalAverage()){
            index = i;
        }
    }
    return enrolledStudents[index].getName();
}
    
    public double calculateTestAverage(int testNumber){
        double total = 0.0;
        for (int i = 0; i < enrolledStudents.length; i++){
            total = total + enrolledStudents[i].getTestScore(testNumber);
        }
        return (total / enrolledStudents.length);
    }

}
