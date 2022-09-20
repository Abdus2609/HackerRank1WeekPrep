import java.util.*;

public class P1PlusMinus {
    
    public static void plusMinus(List<Integer> arr) {

        double denominator = arr.size();

        double numPositive = arr.stream().filter(n -> n > 0).count();
        double numNegative = arr.stream().filter(n -> n < 0).count();
        double numZero = arr.stream().filter(n -> n == 0).count();

        double np = numPositive / denominator;
        double nn = numNegative / denominator;
        double nz = numZero / denominator;

        System.out.println(String.format("%.6g", np));
        System.out.println(String.format("%.6g", nn));
        System.out.println(String.format("%.6g", nz));
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 1, 0, -1, -1);
        plusMinus(arr);
    }
}
