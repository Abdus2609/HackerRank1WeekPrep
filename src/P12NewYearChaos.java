import java.util.*;

public class P12NewYearChaos {
    
    public static void minimumBribes(List<Integer> q) {
        int minimumBribes = 0;

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) - 2 > i + 1) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = i - 1; j >= q.get(i) - 2 && j >= 0; j--) {
                if (q.get(i) <= q.get(j)) {
                    minimumBribes++;
                }
            }
        }

        System.out.println(minimumBribes);
    }

    public static void main(String[] args) {
        List<Integer> q = List.of(3, 1, 2, 4);
        minimumBribes(q);
    }
}
