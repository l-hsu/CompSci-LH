public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private String dogTag;
    private boolean stillInFacility;
    private static int dogsCreated = 0;
    
    public Dog(String name, String ownerName, int age, int dogId){
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.stillInFacility = true;
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, 
            PawesomeUtils.generateDogChar(this.dogId));
        dogsCreated ++;
        
       
    }
    public Dog() {
        this("Unnamed", "Unknown", 1, 100);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }
    

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public static int getDogsCreated(){
        return dogsCreated;
    }

    public void setDogId(int dogId){
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, 
            PawesomeUtils.generateDogChar(this.dogId));
    }
    
    public String toString(){
        String status;
        if (stillInFacility) {
            status = name + " is in the facility";
        } else {
            status = name + " is not in the facility";
        }
        return name + " is " + age + " years old and belongs to " + ownerName
                + ". " + status + ". Dog tag: " + dogTag + ".";
    }

    public boolean equals(Dog other){
        if (other == null){
            return false;
        }
         return name.equals(other.name)
            && ownerName.equals(other.ownerName)
            && age == other.age
            && dogTag.equals(other.dogTag)
            && stillInFacility == other.stillInFacility;
    }

    
}

