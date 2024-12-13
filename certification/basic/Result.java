package certification.basic;

public class Result {

	static int integers = 0;
	static int doubles = 0;
	static int strings = 0;
	
	
	public static boolean testInt(String string) {
		try{
			int i = Integer.parseInt(string);
			System.err.println(i + " is an integer");
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		
	}
	
	public static boolean testDouble(String string) {
		try{
			double d = Double.parseDouble(string);
			System.err.println(d + " is a double");
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		
	}
	public static void typeCounter(String sentence) {
		String[] array = sentence.split(" ");
		
		for(String s : array) {
			if(testInt(s)) {
				integers++;
			}else if(testDouble(s)) {
				doubles++;
			}else {
				System.err.println(s + " is a string");
				strings++;
			}
		}
		System.out.println("string " + strings);
		System.out.println("integer " + integers);
		System.out.println("double " + doubles);
		
	}
	public static void main(String[] args) {
		
		String string = "give me 10 dollars for 34.50 joker.";
		typeCounter(string);
	}

}
