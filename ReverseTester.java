public class ReverseTester {
    public static void main(String[] args) {
        String input = "desserts";
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        String reversedString = stringBuilder.toString();
        System.out.println(input);
        System.out.println("Expected output: stressed");
        System.out.println("Get Output: "+reversedString);
    }
    
}
