public class RandomPrice {
    public static void main(String[] args) {
        double min = 10.0;
        double max = 19.95;
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double ans = Math.random()*(max-min+1)+min;
        System.out.println(ans);
    }
    
}
