public class Sequences {

    // Read REQ 02
    public int sumOfFirst(int n) {
        int total = 0;
        if (n <= 0){
            return 0;
        }
        else{
            for(int count = 1; count <= n; count = count + 1){
                total = total + count;
            }       
        return total;

            
}
    }
     

    // Read REQ 03
    public String countUp(int start, int limit) {
        String result = "";
        for(int count = start; count <= limit; count = count+1){
            if (count != start){
               result = result + " "+count ;
            }
            else{
                result = result + count;
            }

        }
        return result;
    }



    // Read REQ 04
    public String countByThrees(int start, int limit) {
        String result = "";
        for(int count = start; count <= limit; count = count+3){
            if (count != start){
               result = result + " "+count ;
            }
            else{
                result = result + count;
        }
    }
        return result;
        }
    


    // Read REQ 05
    public int productOfFirst(int n) {
        int result = 1;
        for(int count = result; count <= n; count = count+1){
            result = result * count;
        }
        return result;
    }

    

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int multiples = 0;
        if (n <= 0 || factor == 0){
            return 0;
        }
        else{
            for (int count = 1; count <= n; count = count+1){
                if (count % factor == 0){
                    multiples = multiples + 1;
                    
                }
                
            }
        }
        return multiples;
    }

    // Read REQ 07
    public String repeat(String s, int times) {
        String result = "";
        for (int count = 1; count <= times; count = count + 1){
            result = result + s;
        }
        return result;
    }

    // Read REQ 08
    public int power(int base, int exponent) {
        int result = 1;
        for(int count = 1; count <= exponent; count = count + 1){
          result = result * base;
        }
        return result;
    }
}