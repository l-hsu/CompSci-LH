public class Rectangle2Tester{
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2(5,10);
        Rectangle2 rect1 = new Rectangle2(5,10);
        System.out.println("length:"+rect.getLength());
        System.out.println("width:"+rect.getWidth());
        System.out.println("area:"+rect.calculateArea());
        System.out.println("perimeter:"+rect.calculatePerimeter());
        System.out.println("diagonal:"+rect.calculateDiagonal());
        System.out.println(rect.toString());
        System.out.println("equal:"+rect.equals(rect1));

    }
}