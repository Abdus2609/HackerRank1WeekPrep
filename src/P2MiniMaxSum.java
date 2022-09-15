import java.util.*;

public class P2MiniMaxSum {
    
    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);

        long min = arr.subList(0, 4).stream().mapToLong(Long::valueOf).sum();

        long max = arr.subList(1, 5).stream().mapToLong(Long::valueOf).sum();

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(256741038, 623958417, 467905213, 714532089, 938071625));
        miniMaxSum(arr);
    }
}
