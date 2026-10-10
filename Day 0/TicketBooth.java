public class TicketBooth {

    private String showName;
    private int showHour;
    private int seatsLeft;

    // Creates a booth selling one showing.
    // to-do: store all three values in the instance variables
    public TicketBooth(String newShowName, int newShowHour, int newSeatsLeft) {
        showName = newShowName;
        showHour = newShowHour;
        seatsLeft = newSeatsLeft;
    }

    // Returns the name of the show.
    // to-do: implement getShowName
    public String getShowName() {
        return showName;
    }

    // Returns the hour the show starts, on a 24-hour clock.
    // to-do: implement getShowHour
    public int getShowHour() {
        return showHour;
    }

    // Returns how many seats are still unsold.
    // to-do: implement getSeatsLeft
    public int getSeatsLeft() {
        return seatsLeft;
    }

    // ---------- Write these methods ----------

    // Returns "child", "student", "adult", or "senior" for one age.
    // to-do: implement priceCategory
    public String priceCategory(int age) {
        if(age < 0){
            return "";
        }
        else if (age >= 65){
            return "senior";
        }
        else if (age >= 18){
            return "adult";
        }
        else if (age >= 13){
            return "student";
        }
        else{
            return "child";
        }
    }

    // Returns the price in whole dollars after the matinee and member discounts.
    // to-do: implement ticketPrice
    public int ticketPrice(int age, boolean isMember) {
        
        if (age < 0){
            return 100000;
        }
        else if (age >= 65 && isMember){
            return 8;
        }
        else if (age >= 65 && !isMember){
            return 10;
        }
        else if (age >= 18 && isMember && 12<=showHour && showHour <= 16){
            return 13;
        }
        else if (age >= 18 && isMember && !(12<=showHour && showHour <= 16)){
            return 16;
        }
        else if (age >= 18 && !isMember && 12<=showHour && showHour <= 16){
            return 15;
        }
        else if (age >= 18 && !isMember && !(12<=showHour && showHour <= 16)){
            return 18;
        }
        else if (age >= 13 && isMember && 12<=showHour && showHour <= 16){
            return 7;
        }
        else if (age >= 13 && !isMember && 12<=showHour && showHour <= 16){
            return 9;
        }
        else if (age >= 13 && !isMember && !(12<=showHour && showHour <= 16)){
            return 12;
        }
        else if (age <= 12 && isMember){
            return 6;
        }
        else {
            return 8;
        }

    }   
    

    // ---------- Each method below compiles and has exactly one bug ----------

    // Returns "morning" before 12, "matinee" from 12 through 16, and "evening" from 17 on.
    public String showtimeLabel() {
        if (showHour >= 12 && showHour <=16) {
            return "matinee";
        } else if (showHour >= 17) {
            return "evening";
        } else {
            return "morning";
        }
    }

    // Returns "red" for 12 and under, "yellow" for 13 through 17, and "green" for 18 and up.
    public String wristband(int age) {
        String color = "green";
        if (age <= 12) {
            return "red";
        }
        else if (age <= 17) {
            return "yellow";
        }
        else{
            return "green";
        }
    }

    // Returns 2 for a member and 0 for anyone else.
    public int memberDiscount(boolean isMember) {
        if (isMember == true) {
            return 2;
        }
        return 0;
    }

    // ---------- Write these with guard clauses ----------

    // Stores the new hour only when it is 10 through 23.
    // to-do: implement setShowHour
    public void setShowHour(int newShowHour) {
        if (showHour < 10 || showHour > 23){
            System.out.print("invalid");
        }
        else{
            showHour = newShowHour;
        }
    }

    // Stores the new count only when it is 0 through 200.
    // to-do: implement setSeatsLeft
    public void setSeatsLeft(int newSeatsLeft) {
        
    }

    // Stores the new name only when it is not null and not empty.
    // to-do: implement setShowName
    public void setShowName(String newShowName) {
    }

    // Sells the seats when the group fits. Otherwise prints why and changes nothing.
    // to-do: implement sell
    public void sell(int groupSize) {
    }
}
    

