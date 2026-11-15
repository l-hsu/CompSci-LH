

public class RPSRules {

    public static boolean isValidChoice(String choice){
        if (choice == null){
            return false;
        }
        if (choice.equals("rock")|| choice.equals("scissors")||choice.equals("paper")){
            return true;
        }
        return false;
    }

    public static String randomChoice(){
        double a = Math.random();
        if (a >= (2.0/3)){
            return "rock";
        }
        else if (a <= (1.0/3)){
            return "scissors";
        }
        else{
            return "paper";
        }
    }

    public static boolean beats(String mine, String theirs){
        if (mine.equals("rock") && theirs.equals("scissors")){
            return true;
        }
        else if(mine.equals("paper") && theirs.equals("rock")){
            return true;
        }
        else if(mine.equals("scissors") && theirs.equals("paper")){
            return true;
        }
        else{
            return false;
        }
    }

}   
