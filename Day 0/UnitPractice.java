public class UnitPractice {

    // Read REQ 02
    public String alarmClock(int day, boolean vacation) {
        if (vacation == true && day != 0 && day != 6){
            return "10:00";
        }
        else if(vacation == true){
            return "off";
        }
        else if(day != 0 && day != 6){
            return "7:00";
        }
        else{
            return "10:00";
        }
    }

    // Read REQ 03
    public boolean makesSix(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a-b) == 6){
            return true;
        }
        else{
            return false;
        }
    }

    // Read REQ 04
    public int ticketPrize(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2){
            return 10;
        }
        else if(a == b && b == c){
            return 5;
        }
        else if(a != b && a != c){
            return 1;
        }
        else{
            return 0;
        }

    }


    // Read REQ 05
    public String fizzBuzzLabel(String str) {
        int length = str.length();
        if (str.charAt(0) == 'f' && str.charAt(length-1) == 'b'){
            return "FizzBuzz";
        }
        else if(str.charAt(0) == 'f'){
            return "Fizz";
        }
        else if(str.charAt(length-1) == 'b'){
            return "Buzz";
        }
        else{
            return str;
        }
    }

    // Read REQ 06
    public String doubleChar(String str) {
        String string = "";
        if (str == ""){
            return "";
        }
        for (int i = 0; i < str.length(); i++){
            string = string + str.charAt(i) + str.charAt(i);
        }
        return string;
    }

    // Read REQ 07
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.substring(i,i+2).equals("hi")){
                count ++;
            }
        }
        return count;
    }

    // Read REQ 08
    public boolean catsEqualDogs(String str) {
        int dogs = 0;
        int cats = 0;
        for (int i = 0; i < str.length() - 2; i++){
            if (str.substring(i,i+3).equals("dog")){
                dogs ++;
            }
        }
        for (int i = 0; i < str.length() - 2; i++){
            if (str.substring(i,i+3).equals("cat")){
                cats ++;
            }
        }
        if (cats == dogs){
            return true;
        }
        else{
            return false;
        }
    }

    // Read REQ 09
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++){
            if (str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e'){
                count ++;
            }
        }
        return count;
    }

    // Read REQ 10
    public String repeatEnd(String str, int n) {
        String string = str.substring(str.length()-n, str.length());
        String end = "";
        for (int i = 0; i < n; i++){
            end = end + string;
        }
        return end;
    }

    // Read REQ 11
    public String firstTwo(String str) {
        String string = "";
        if (str.length() < 2){
            for (int i = 0; i <2 - str.length(); i++){
                string = string + "*";
            }
            string = str + string;
        }
        else{
            string = str.substring(0,2);
        }
        return string;
    }

    // Read REQ 12
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    // Read REQ 13
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1;i++){
            if (nums[i] == 2 && nums[i+1] == 2){
                return true;
            }
        }
        return false;
    }
}
    

