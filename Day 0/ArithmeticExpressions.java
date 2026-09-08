public class ArithmeticExpressions {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Time Breakdown ---");
        int totalSeconds = 7384;
        int hours = totalSeconds / 3600;
        int minutes = totalSeconds / 60 - 60*hours ;
        int seconds = totalSeconds % 60 ;
        System.out.println("Hours: " +hours+ "\nMinutes: "+minutes+"\nSeconds: "+seconds);
        System.out.println("--- Part 2: Triangle Calculator ---");
        double sideA = 6.0;
        double sideB = 8.0;
        double hypotnuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        double area = (sideA * sideB) / 2;
        double perimeter = sideA + sideB + hypotnuse;
        System.out.println("Hypotenuse: "+hypotnuse+"\nArea: "+area+"\nPerimeter: "+perimeter);
        System.out.println("--- Part 3: Score Tracker ---");
        int score = 200;
        score += 150;
        score *= 2;
        score -=50;
        score /=5;
        System.out.println("Final Score: "+score);
        System.out.println("--- Part 4: Increment and Absolute Value ---");
        int counter = 10;
        int elevation = -300;
        counter++;
        counter++;
        counter--;
        elevation = Math.abs(elevation);
        System.out.println("Counter: "+counter+"\nDepth: "+elevation);
    }
        
}