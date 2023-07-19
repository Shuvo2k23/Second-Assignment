public class ReplaceTester {
    private String city;
    public ReplaceTester(){
        city = "Mississippi";

    }
    public String replaceIS(){
        
        String new_cityname;
        
        new_cityname = city.replace("i", "!");
        new_cityname = new_cityname.replace("s", "$");
        
        return new_cityname;
    }
   
    public static void main(String[] args) {
        ReplaceTester city1 = new ReplaceTester();
        System.out.println("Expected Output:  M!$$!$$!pp!");
        System.out.println("Get OUtput: "+city1.replaceIS());
        
    }
    
}
