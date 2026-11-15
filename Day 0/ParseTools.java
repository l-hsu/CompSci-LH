public class ParseTools {
    
    public static double toDouble(String text){
        Double a = Double.parseDouble(text);
        return a;
    }

    public static String describeChar(char value){
        Character a = value;
        if (Character.isDigit(a) == true){
            return "digit";
        }
        else if(Character.isLetter(a) == true){
            return "letter";
        }
        else{
            return "other";
        }

    }

    public static boolean isInteger(String text) {
        if (text == null || text.length() == 0) {
            return false;
        }

        int start = 0;
        if (text.charAt(0) == '-') {
            start = 1;
        }
        if (start == text.length()) {   // "-" by itself
            return false;
        }

        for (int i = start; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
        
    

    public static Integer parseOrNull(String text){
        if(isInteger(text)){
            return Integer.parseInt(text);
        }
        else{
            return null;
        }
        
        
    }
}

