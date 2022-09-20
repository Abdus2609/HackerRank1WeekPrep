public class P10CaesarCipher {
    
    public static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();

        k %= 26;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                if (c + k > 'Z') {
                    sb.append((char) ('A' + (k - 1 - ('Z' - c))));
                } else {
                    sb.append((char) (c + k));
                }
            } else if (Character.isLowerCase(c)) {
                if (c + k > 'z') {
                    sb.append((char) ('a' + (k - 1 - ('z' - c))));
                } else {
                    sb.append((char) (c + k));
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf('A'));
        System.out.println(Integer.valueOf('Z'));
        System.out.println(Integer.valueOf('a'));
        System.out.println(Integer.valueOf('z'));
        System.out.println((char) ('a' + 3));
        System.out.println(('W' + 5) > 'Z');
        System.out.println(caesarCipher("There's-a-starman-waiting-in-the-sky", 3));
    }
}
