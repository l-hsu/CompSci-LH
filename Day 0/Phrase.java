public class Phrase {

    private String text;

    public Phrase(String text){
        this.text = text;
    }
    public void setPhrase(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    // Read REQ 03
    public String reversed() {
        int length = text.length();
        String result = "";
        for (int index = length - 1; index >= 0; index = index - 1){
             String a = text.substring(index, index + 1);
             result = result + a;
        }
        return result;
    }

    // Read REQ 04
    public int countChar(char target) {
        String string = text;
        int length = string.length();
        int count = 0;
        for (int i = 0; i < length; i = i + 1){
            char a = text.charAt(i);
            if (a == target){
                count = count + 1;
            }
        }
        return count;
    }

    // Read REQ 05
    public boolean isAllDigits() {
        int length = text.length();
        int wrong = 0;
        if (text.length() == 0){
            return false;
        }
        for (int i = 0; i < length; i = i + 1){
            char a = text.charAt(i);
            if (a > 57 || a < 48){
                wrong = wrong + 1;
            }
        }
        if (wrong > 0){
            return false;
        }
        else{
            return true;
        }
    }

    // Read REQ 06
    public int countAdjacentPairs() {
        int length = text.length();
        int pairs = 0;
        for (int i = 0; i < length - 1; i = i + 1){
            char a = text.charAt(i);
            char b = text.charAt(i + 1);
            if (a == b){
                pairs = pairs + 1;
            }
        }
        return pairs;
    }

    // Read REQ 07
    public int countOccurrences(String target) {
        int length = text.length();
        int tLength = target.length();
        int occurences = 0;
        for (int i = 0; i <= length - tLength; i = i + 1){
            String a = text.substring(i, i + tLength);
            if (a.equals(target)){
                occurences = occurences + 1;
            }
        }
        return occurences;
    }

    // Read REQ 08
    public String capitalizeWords() {
        int length = text.length();
        String a = "";
        for (int i = 0; i < length; i = i+1){
            if (i == 0 || text.substring(i-1, i).equals(" ")){
                String b = text.substring(i, i+1);
                b = b.toUpperCase();
                a = a + b;
            }
            else{
                a = a + text.substring(i, i+1);
            }
        }
        return a;
    }

    // Read REQ 09
    public boolean isPalindrome() {
         int length = text.length();
        String result = "";
        for (int index = length - 1; index >= 0; index = index - 1){
             String a = text.substring(index, index + 1);
             result = result + a;
        }
        result = result.toLowerCase();
        text = text.toLowerCase();
        if (text.equals(result)){
            return true;
        }
        else{
            return false;
        }
    }
    }


