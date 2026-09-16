public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student("John");
        Student student1 = new Student("Jane",11);
        Student student2 = new Student("Doe");
        Student student3 = new Student("Bob",11);
        student.generateId();
        student1.generateId();
        student2.generateId();
        student3.generateId();
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        student1.setName("Jane");
        student1.setGrade(11);
        System.out.println(student.equals(student2));
    }   

}