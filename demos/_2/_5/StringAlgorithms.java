package demos._2._5;

public class StringAlgorithms {
    public static void main(String[] args) {

        String s = "Hello World";

        // Traverse string character by character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }

        // Count specific characters
        int spaceCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Build a new string (reverse)
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        // Check if string contains only letters
        boolean allLetters = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetter(c)) {
                allLetters = false;
            }
        }

        // Replace characters
        String noSpaces = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                noSpaces += s.charAt(i);
            }
        }
    }
}
