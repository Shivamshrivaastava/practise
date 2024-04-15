 class GoodOrBadString {
    public static void main(String[] args) {
        String str = "aeiou"; // Example string
        int threshold = 3; // Threshold for consecutive vowels or consonants
        
        if (isGoodString(str, threshold)) {
            System.out.println("Good String");
        } else {
            System.out.println("Bad String");
        }
    }

    public static boolean isGoodString(String str, int threshold) {
        // Convert string to lowercase for case insensitivity
        str = str.toLowerCase();
        
        // Variables to count consecutive vowels and consonants
        int consecutiveVowels = 0;
        int consecutiveConsonants = 0;
        
        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is a vowel, increment consecutiveVowels and reset consecutiveConsonants
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                consecutiveVowels++;
                consecutiveConsonants = 0;
            } 
            // If the character is a consonant, increment consecutiveConsonants and reset consecutiveVowels
            else {
                consecutiveConsonants++;
                consecutiveVowels = 0;
            }
            
            // If consecutiveVowels or consecutiveConsonants exceeds the threshold, return false
            if (consecutiveVowels > threshold || consecutiveConsonants > threshold) {
                return false;
            }
        }
        // If no consecutive vowels or consonants exceed the threshold, return true
        return true;
    }
}
