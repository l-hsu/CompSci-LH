public class ArrayOps {

    // Read REQ 02
    public String toText(int[] nums) {
        String a = "[";
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                a = a + nums[i];
            }
            else{
                a = a + ", " + nums[i];
            }
        }
        a = a + "]";
        return a;
    }
        
    

    // Read REQ 03
    public int[] numbersFrom(int start, int end) {
        if (!(end > start)){
            return new int[0];
        }
        else{
            int []a = new int[end - start];
            for (int i = start; i < end; i++){
                a[i-start] = i;
            }
        return a;
        }
    }

    // Read REQ 04
    public double averageLength(String[] words) {
        int b = words.length;
        float c = 0;
        int count = 0;
        if (words.length == 0){
            return 0.0;
        }
        else{
            for (int i = 0; i < b; i++){
                String d = words[i];
                c = c + d.length();
                count ++;
            }
        }
        return c / count;
    }

    // Read REQ 05
    public boolean hasWord(String[] words, String target) {
        int a = words.length;
        for (int i = 0; i < a; i++){
            if (words[i].equals(target)){
                return true;
            }
        }
        return false;
    }

    // Read REQ 06
    public int indexOfLongest(String[] words) {
        int a = words.length;
        int longest = 0;
        if (words.length == 0){
            return -1;
        }
        for(int i = 1; i < a; i++){
            String d = words[i];
            if (d.length() > words[longest].length()){
                longest = i;
            }
        }
        return longest;
    }

    // Read REQ 07
    public boolean isIncreasing(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return true;
        }
        else{
            for (int i = 0; i < nums.length - 1; i++){
                if (nums[i] >= nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }

    // Read REQ 08
    public int[] reversed(int[] nums) {
        int count = nums.length - 1;
        int [] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            b[i] = nums[count];
            count = count - 1;
            }
        
        return b;
    }
    


    // Read REQ 09
    public int[] removeAndShift(int[] nums, int index) {
        for (int i = index; i < nums.length; i++){
            if (i != nums.length - 1){
                nums[i] = nums[i+1];
            }
            else{
                nums[i] = 0;
            }
        }
        return nums;
    }

    // Read REQ 10
    public int[] valuesInRange(int[] nums, int low, int high) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= low && nums[i] <= high){
                count = count + 1;
            }
        }
        int b [] = new int[count];
        int filled = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= low && nums[i] <= high){
                b[filled] = nums[i];
                filled++;
        }
    }
    return b;
}
}
    

