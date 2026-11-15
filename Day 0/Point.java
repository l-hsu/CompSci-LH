public class Point {
    
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return this.y;
    }

    public double distanceTo(Point other){
        
        int dx = other.getX() - x;
        int dy = other.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
