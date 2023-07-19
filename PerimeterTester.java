public class PerimeterTester {
    private int height,width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int perimeter(){
        int ans;
        ans = 2*(height+width);
        return ans;
    }
    public static void main(String[] args) {
        PerimeterTester rectangle = new PerimeterTester();
        rectangle.setHeight(12);
        rectangle.setWidth(5);
        System.out.println("Expected perimeter: "+rectangle.perimeter());
        int getperimeter = 2*(rectangle.getHeight()+rectangle.getWidth());
        System.out.println("Calculated parimeter: "+getperimeter);
    }

    
}
