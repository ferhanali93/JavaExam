package problems;
public class Palindrome {

    public static void main(String[] args) {
        String p = "MADAM";
        if (isPalindrome(p)) {
            System.out.println("\""+p+"\" is Palindrome");
        }
        else {
            System.out.println("\""+p+"\" is not palindrome");
        }
    }
    public static boolean isPalindrome(String string) {

        String word = string;
        StringBuilder palindrome = new StringBuilder();
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            palindrome.append(word.charAt(wordLength - 1 - i));
        }
        String revPalindrome = new String(palindrome);

        if (word.matches(revPalindrome)) return true;
        else return false;
    }
}