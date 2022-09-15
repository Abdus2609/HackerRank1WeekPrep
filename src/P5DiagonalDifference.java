import java.util.*;

public class P5DiagonalDifference {
    
    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftToRight = 0;
        int rightToLeft = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get((arr.size() - 1) - i);
        }

        return Math.abs(leftToRight - rightToLeft);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12));
        System.out.println(diagonalDifference(arr));
    }
}
