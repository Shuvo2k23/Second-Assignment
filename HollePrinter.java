public class HollePrinter {
    private String input ;
    public HollePrinter(){
        input = "Hello, World";
    }
    public String replacer(){
        String new_string ;
        new_string = input.replace('e', '1');
        new_string = new_string.replace('o', 'e');
        new_string = new_string.replace('1', 'o');
        
        return new_string;
    }
    public static void main(String[] args) {
        HollePrinter hollePrinter = new HollePrinter();
        System.out.println(hollePrinter.replacer());
    }
    
}
