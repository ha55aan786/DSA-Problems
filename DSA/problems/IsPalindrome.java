package problems;

// write a function to check if the given String is Palindrome or not

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));

    }
    public static boolean isPalindrome(String s) {
        int l = s.length();
        int limit = l/2;
        int j = 1;

        for (int i =0; i <= limit ; i++) {

            if (s.charAt(i) == s.charAt(l-j)) {
                j++;
            } else {
                return false;
            }
        }
        return true;
    }
}
