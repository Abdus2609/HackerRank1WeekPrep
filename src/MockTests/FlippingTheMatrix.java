package MockTests;

import java.util.*;

public class FlippingTheMatrix {
    
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int n = matrix.size() / 2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int num1 = matrix.get(i).get((2*n) - j - 1);
                int num2 = matrix.get(i).get(j);
                int num3 = matrix.get((2*n) - i - 1).get(j);
                int num4 = matrix.get((2*n) - i - 1).get((2*n) - j - 1);
                sum += Math.max(num1, Math.max(num2, Math.max(num3, num4)));
            }
        }
       
        return sum;
    }
       
}
