public class PawesomeUtils {
   
         public static char generateDogChar(int dogId){
            int a = dogId / 100;
            int c = dogId % 10;
            int b = dogId / 10 % 10;
            int total = a + b + c;
            total = total % 10;
            return (char)(70 + total);
         

        }

        public  static String generateDogTag(int dogId, char dogChar){
            String dogTag = "" + dogId + dogChar;
            return dogTag;
        }

        public static int validateDogId(int dogId){
            if(dogId >= 100 && dogId <= 999){
                return dogId;
            }
            int a = (int)(Math.random() * 900)+100;
            dogId = a;
            return dogId;
        }
            
        public static String pickup(Dog dog, String person){
            if (dog == null){
                return "no dog";
            }
            if (person.equals(dog.getOwnerName())){
                dog.setStillInFacility(false);
                return ""+dog+"has left.";
            }
            else{
                return "not correct owner";
            }
        }
        public static int convertAgeToHumanAge(Dog dog){
             int age = dog.getAge();
            if (age <= 1) {
                    return 15;
            }
            return 24 + (age - 2) * 5;
}

        
        public static boolean hasValidTag(Dog dog) {
    if (dog == null) {
        return false;
    }
    int id = dog.getDogId();
    char c = PawesomeUtils.generateDogChar(id);
    String expectedTag = PawesomeUtils.generateDogTag(id, c);
    return expectedTag.equals(dog.getDogTag());

    }

        public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        }
        if (humanYears <= 24) {
            return 2;
        }
        return 2 + (humanYears - 24) / 5;
    }
        
}


