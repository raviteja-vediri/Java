package Programs;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Using Loop
		String txt= "Hello World!";
		String Reversed_txt ="";
		
		for(int i =txt.length()-1; i >=0; i--) {
			Reversed_txt += txt.charAt(i);
		}
		System.out.println("Reversed String: " + Reversed_txt);
		
		//Using String Builder
		
//		Explanation:
//		new StringBuilder(original): Creates a StringBuilder object initialized with the original string.
//		reversed.reverse(): The reverse() method in StringBuilder reverses the sequence of characters.
//		reversed.toString(): Converts the StringBuilder back to a String.
		
		StringBuilder reversed= new StringBuilder(txt);
		
		reversed.reverse();
		
		System.out.println("Reversed String: " + reversed.toString());
	}

}
