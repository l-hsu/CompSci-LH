import java.util.Scanner;

public class RPSGame {
    
    private Player player;
    private Player computer;

    public RPSGame(Player player, Player computer){
        this.player = player;
        this.computer = computer;
    }

    public Player getPlayer(){
        return this.player;
    }
    public Player getComputer(){
        return this.computer;
    }

    public String winner(){
        String a = this.player.getChoice();
        String b = this.computer.getChoice();
        if (a.equals(b)){
            return "tie";
        }
        else if(RPSRules.beats(a, b)){
            return player.getName();
        }
        else{
            return computer.getName();
        }
    
        
    }

    public static int readRounds(Scanner input){
        System.out.println("How many rounds?");
        String lines = input.nextLine();
        return Integer.parseInt(lines);
    }

    public void readChoice(Scanner input){
        boolean accepted = false;
        while (!accepted) {
            System.out.println("Rock, paper, or scissors?");
            String line = input.nextLine();
            accepted = player.choose(line);
    }
    }


  

}
