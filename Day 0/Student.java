public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String newName){
        name = newName;
        grade = 10;
        id = generateId();
    }

    public Student(String newName, int newGrade){
        name = newName;
        grade = newGrade;
        id = generateId();
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setGrade(int newGrade){
        grade = newGrade;
    }
    public int getGrade(){
        return grade;
    }
    public void setId(String newId){
        id = newId;
      
    }
    public String getId(){
        return id;
    }
    public String generateId(){
        int part1 = (int)(Math.random() * 800)+100;
        int part2 = (int)(Math.random() * 9000)+1000; 
        this.id = part1+"-"+part2;
        return this.id;
    }
    public void toString(String name, int grade, String id){
        System.out.println("Name:"+name+"Grade:"+grade+"ID:"+id);
    }
    public boolean equals(Student other){
        boolean same = this.name.equals(other.name) && this.grade 
        == other.grade && this.id.equals(other.id);
        return same;
    }
    

















}


