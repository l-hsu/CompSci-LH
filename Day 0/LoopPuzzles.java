public class LoopPuzzles {

    // Read REQ 02
    public int stepsToOne(int start) {
        int times = 0;
        while (start != 1){
            if (start == 0 || start == -1){
                return -1;
            }
            else if(start % 2 == 0){
                start = start / 2;
                times = times + 1;
            }
            else{
                start = (3*start)+ 1;
                times = times+1;
            }
        }
        
        return times;
    }

    // Read REQ 03
    public int sumDigits(int n) {
        int num = 0;
        n = Math.abs(n);
        while (n > 0){
            num = num + (n % 10);
            n = n/10;
        }
        
        return num;
    }

    // Read REQ 04
    public int reverseDigits(int n) {
        boolean negative = false;
        if (n >= 0){
            negative = false;
        }
        else{
            negative = true;
        }
        int num = 0;
        n = Math.abs(n);
        while (n > 0){
            num = (num * 10) + (n % 10) ;
            n = n/10;
        }
        if (negative == true){
            return -num;
        }
        else{
            return num;
        }
    }

    // Read REQ 05
    public boolean isPowerOfThree(int n) {
        if (n <= 0){
            return false;
        }
        while (n % 3 == 0){
            n = n/3;
        }
        return n == 1;
        
    }

    // Read REQ 06
    public int firstRunningTotalAbove(int limit) {
        int total = 0;
        int next = 1;
        while (total <= limit){
            total = total + next;
            next = next + 1;
        }
        return total;
    }

    // Read REQ 07
    public String readUntilSentinel(String csv, String sentinel) {
        String unread = csv + ",";
        String result = "";
        while (unread.length() > 0){
            int commaIndex = unread.indexOf(",");
            String token = unread.substring(0,commaIndex);
            unread = unread.substring(commaIndex + 1);
            if (token.equals(sentinel)){
                return result;
            }
            if (result.length() > 0){
                result += " ";
            }
            result += token;
        }
        return result;
    }
}
    

