public class UseTrim {
    private String input;
	public UseTrim(){
		input = "   H e l l o    ";
		System.out.println("Trim() Returns a string whose value is this string, with any leading and trailing whitespace removed.");
	}
	public String CallTrim(){
		String newString;
		newString = input.trim();
		return newString;
	}
	public String getinput(){
		return input;
	}
	public static void main(String[] args) {
		UseTrim obj = new UseTrim();
		System.out.print("Before trim() call:");
		System.out.println(obj.getinput());
		System.out.print("After call:");
		System.out.println(obj.CallTrim());
	}
}
