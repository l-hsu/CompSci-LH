import java.util.Scanner;

public class Player {
    
    private String name;
    private String choice;

    public Player(String name){
        this.name = name;
        this.choice = RPSRules.randomChoice();
    }

    public String getName(){
        return this.name;
    }
    public String getChoice(){
        return this.choice;
    }

    public boolean choose(String typed) {
        if (typed == null) {
            return false;
        }
        typed = typed.toLowerCase();
        if (RPSRules.isValidChoice(typed)) {
            choice = typed;
            return true;
        }
        return false;
}

    public String toString(){
        return name + " chose "+ choice + ".";
    }
}
