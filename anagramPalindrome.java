import java.util.Arrays;
class AnagramPalindrome {
    public static void main(String[] args) {
        String str = "racecar";
        
        if (isAnagram(str) && isPalindrome(str)) {
            System.out.println("The string is both an anagram and a palindrome.");
        } else {
            System.out.println("The string is either not an anagram or not a palindrome.");
        }
    }
    
    public static boolean isAnagram(String str) {
        // Assuming that the anagram is checked against a predefined word
        String predefinedWord = "carrace";
        
        // Remove spaces and convert to lowercase
        String s1 = str.replaceAll("\\s", "").toLowerCase();
        String s2 = predefinedWord.replaceAll("\\s", "").toLowerCase();
        
        // Check if the strings have the same length
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Convert strings to character arrays and sort
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    
    public static boolean isPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check if the string is a palindrome
        int left = 0;
        int right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
