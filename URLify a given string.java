public class URLifyString {
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        int trueLength = 13; // Length of the actual string excluding the trailing spaces
        String urlified = urlifyString(str, trueLength);
        System.out.println("URLified String: " + urlified);
    }

    public static String urlifyString(String str, int trueLength) {
        char[] charArray = str.toCharArray();
        int spaceCount = 0;
        
        // Count spaces to determine the new length of the string
        for (int i = 0; i < trueLength; i++) {
            if (charArray[i] == ' ') {
                spaceCount++;
            }
        }
        
        // Calculate the new length of the string
        int newIndex = trueLength + spaceCount * 2;
        
        // Start filling the characters from the end of the string
        for (int i = trueLength - 1; i >= 0; i--) {
            if (charArray[i] == ' ') {
                charArray[newIndex - 1] = '0';
                charArray[newIndex - 2] = '2';
                charArray[newIndex - 3] = '%';
                newIndex -= 3;
            } else {
                charArray[newIndex - 1] = charArray[i];
                newIndex--;
            }
        }
        return new String(charArray);
    }
}
