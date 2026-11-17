public class Rectangle2{

    private int length;
    private int width;

    public Rectangle2(int newLength, int newWidth){
        length = newLength;
        width = newWidth;
    }
    public Rectangle2(){
        length = 1;
        width = 1;
    }
    public void setLength(int newLength){
        length = newLength;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }
    public int getWidth(){
        return width;
    }
    public int calculateArea(){
        int area = width * length;
        return area;
    }
    public int calculatePerimeter(){
        int perimeter = 2*(width) + 2*(length);
        return perimeter;
    }
    public double calculateDiagonal(){
        double diagonal = Math.sqrt(width*width + length*length);
        return diagonal;
    }
    public String toString(){
        return "This rectangle has length "+length+" and width "+width+".";
    }
    public boolean equals(Rectangle2 other){
        boolean same = length == other.getLength() && width == other.getWidth();
        return same;
    }   
    
   
    
    
    
    




}