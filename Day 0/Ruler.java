public class Ruler {
    private boolean CmOrIn;
    private int length;
    private String material;
    private boolean smash;

    public Ruler(){
        CmOrIn = true;
        length = 12;
        smash = true;
        material = "plastic";

    }

    public void setLength(int newLength){
        length = newLength;
    }

    public int getLength(){
        return length;
    }
        

    public boolean broken(String material){
        boolean broken;
            if (material.equals ("metal"))
                broken = false;
            else{
                broken = true;
            }
            return broken;
        }
     }
    public int measure(int measureLength){
        if (measureLength > 12)
        System.out.println("Unable to measure. It is too long"); 
        else if (measureLength < 5){
        System.out.println("Its so small");
    }
        

}
