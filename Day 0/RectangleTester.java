public class RectangleTester{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5,10);
        Rectangle rect1 = new Rectangle(5,10);
        System.out.println("length:"+rect.getLength());
        System.out.println("width:"+rect.getWidth());
        System.out.println("area:"+rect.calculateArea());
        System.out.println("perimeter:"+rect.calculatePerimeter());
        System.out.println("diagonal:"+rect.calculateDiagonal());
        System.out.println(rect.toString());
        System.out.println("equal:"+rect.equals(rect1));

    }
}