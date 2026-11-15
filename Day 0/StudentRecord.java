import java.util.Arrays;

public class StudentRecord {
    
    private String name;
    private int[] scores;
    
    public StudentRecord(String name, int[] scores){
        this.name = name;
        if (scores == null){
            this.scores = new int[0];
        }
        else{
            this.scores = scores;
        }
    }

    public StudentRecord(String name){
        this(name, null);
    }

    public String getName(){
        return this.name;
    }
    
    public int[] getScores(){
        return this.scores;
    }

    public int getTestScore(int testNumber){
        if (testNumber > scores.length - 1 || testNumber < 0){
            return -1;
        }
        else{
            return scores[testNumber];
        }
    }

    public String toString(){
        return name + "'s scores: "+Arrays.toString(scores);
    }

    public double getAverage(int first, int last){
        int count = 0;
        double num = 0;
        for (int i = first; i <= last; i++){
            count ++;
           num = num + scores[i];
        }
        return num / count;
    }

    public double getAverage(){
        if (scores.length < 1){
            return 0.0;
        }
        else{
            return getAverage(0, scores.length-1);
        }   
    }

    public boolean hasImproved(){
        if (scores == null){
            return true;
        }
        else{
            for(int i =1; i < scores.length; i++){
                if (scores[i] < scores[i-1]){
                    return false;
                }
            }
        }
        return true;
    }
    public double getFinalAverage(){
        if (scores.length < 1){
            return 0.0;
        }
        if (hasImproved()){
            return getAverage((scores.length)/2, scores.length - 1);
        }
        else{
            return getAverage();
        }
    }
}
