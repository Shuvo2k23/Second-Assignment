public class Height_Width {
    private double area,perimeter;
    
    


    public void print(double h,double w){
        System.out.println("Height of this rectangle: "+h);
        System.out.println("Width of this retangle: "+w);
    }

    public void getArea(double area){
        double length;
        length =Math.sqrt(area);
        print(length, length);
    }

    public void getPerimeter(double perimeter){
        double length;
        length = perimeter/4;
        print(length, length);
    }

    public static void main(String[] args) {
        Height_Width rectangle = new Height_Width();
        rectangle.getArea(42);
        rectangle.getPerimeter(42);
    }
    
}
