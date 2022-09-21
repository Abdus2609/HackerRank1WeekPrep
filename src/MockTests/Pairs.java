package MockTests;

import java.util.*;

public class Pairs {
    
    public static int pairs(int k, List<Integer> arr) {

        int num = 0;

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (Math.abs(arr.get(j) - arr.get(i)) == k) {
                    num++;
                } else if (Math.abs(arr.get(j) - arr.get(i)) > k) {
                    break;
                }
            }
        }

        return num;
    }
}
