package day19_string;

public class P05IsAlphaNumeric {

	public static int isAlnum(char[] A) {
		for (char c : A) {
			if (!Character.isLetterOrDigit(c)) {
				return 0; // Return 0 if any character is not alphanumeric
			}
		}
		return 1; // Return 1 if all characters are alphanumeric
	}

	public static void main(String[] args) {
		char[] A1 = { 'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0' };
		char[] A2 = { 'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0' };

		System.out.println("Is A1 alphanumeric? " + isAlnum(A1));
		System.out.println("Is A2 alphanumeric? " + isAlnum(A2));
		System.out.println("Is A1 alphanumeric? " + areAllAlphanumeric(A1));
		System.out.println("Is A2 alphanumeric? " + areAllAlphanumeric(A2));
		
	}

	public static boolean isAlphanumeric(char c) {
		// Check if the character is a digit
		if (c >= '0' && c <= '9') {
			return true;
		}
		// Check if the character is an uppercase alphabet
		if (c >= 'A' && c <= 'Z') {
			return true;
		}
		// Check if the character is a lowercase alphabet
		if (c >= 'a' && c <= 'z') {
			return true;
		}
		// If none of the above, it's not alphanumeric
		return false;
	}

	public static int areAllAlphanumeric(char[] A) {
		for (char c : A) {
			if (!isAlphanumeric(c)) {
				return 0; // Return 0 if any character is not alphanumeric
			}
		}
		return 1; // Return 1 if all characters are alphanumeric
	}

}
