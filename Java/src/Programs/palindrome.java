package Programs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String txt= "madam";
        boolean isPalindrome = isPalindrome(txt);
        System.out.println("Is the string a palindrome? " + isPalindrome);
	}
	
	public static boolean isPalindrome(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
	}

}
