public class P11RecursiveDigitSum {
    
    public static int superDigit(String s, int k) {

        int result = recursiveSumOfDigits(s) * k;

        return (result > 9) ? recursiveSumOfDigits(Integer.toString(result)) : result ;
    }

    private static int recursiveSumOfDigits(String s) {

        if (s.length() == 1) {
            return Integer.parseInt(s);
        }

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        return recursiveSumOfDigits(Integer.toString(sum));
    } 



    public static void main(String[] args) {
        String s = "123";
        System.out.println(superDigit(s, 100000));
    }
}
