public class Problem_1{
    private String cityname;
    public Problem_1(){
        cityname = "Mississippi";

    }
    public int replaceI(){
        int new_size;
        String new_cityname;
        new_cityname = cityname.replace("i", "ii");
        new_size = new_cityname.length();
        return new_size;
    }
     public int replaceS(){
        int new_size;
        String new_cityname;
        new_cityname = cityname.replace("ss", "s");
        new_size = new_cityname.length();
        return new_size;
    }
    public static void main(String[] args) {
        Problem_1 city1 = new Problem_1();
        System.out.println(city1.replaceI());
        System.out.println(city1.replaceS());
    }
}