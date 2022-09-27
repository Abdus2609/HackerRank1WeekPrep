
public class PalindromeIndex {
    
    public static int palindromeIndex(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        if (isPalindrome(s)) {
            return -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            sb.deleteCharAt(i);
            if (isPalindrome(sb.toString())) {
                return i;
            }
            
            sb = new StringBuilder(s);
        }
        
        return -1;
    }
        
    private static boolean isPalindrome(String s) {
            
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("aaabaa"));
    }
}
