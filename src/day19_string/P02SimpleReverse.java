package day19_string;

public class P02SimpleReverse {

	public static String reverseString(String A) {
        StringBuilder reversed = new StringBuilder(A);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String A1 = "scaler";
        String A2 = "academy";

        System.out.println("Reversed A1: " + reverseString(A1));
        System.out.println("Reversed A2: " + reverseString(A2));
    }
    
    public static String reverseString1(String A) {
        char[] charArray = A.toCharArray();
        int left = 0, right = charArray.length - 1;

        // Swap characters to reverse the string
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

}
