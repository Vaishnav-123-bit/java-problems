class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase
        s = s.toLowerCase();

        // Use a StringBuilder to build a new string with alphanumeric characters
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                b.append(s.charAt(i));
            }
        }

        // Check if the new string is a palindrome
        int n = b.length();
        for (int i = 0; i < n / 2; i++) {
            if (b.charAt(i) != b.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
