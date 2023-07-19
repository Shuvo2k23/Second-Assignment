import java.awt.Point;

public class PointTester {
    public static void main(String[] args) {
        Point first = new Point(3,4);
        Point second = new Point(-3, -4);
        double dis =first.distance(second);
        System.out.println("Expected Distance: 10.0");
        System.out.println("Calculated distance: "+dis);
    }
    
}
