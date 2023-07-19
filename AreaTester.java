public class AreaTester {
    private int height,width;
    
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public int area(){
        int ans;
        ans = width*height;
        return ans;
    }
    public static void main(String[] args) {
        AreaTester test = new AreaTester();
        test.setHeight(5);
        test.setWidth(9);
        System.out.println(test.area());
    }
    
}
