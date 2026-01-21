package activities._2._5;

public class PigLatin {

    public static String pigLatin(String word) {
        // YOUR CODE HERE
        // If starts with vowel (a,e,i,o,u): add "yay"
        // If starts with consonant: move first letter to end, add "ay"
        return "";
    }

    public static void main(String[] args) {
        System.out.println(pigLatin("hello")); // ellohay
        System.out.println(pigLatin("apple")); // appleyay
        System.out.println(pigLatin("java"));  // avajay
    }
}
