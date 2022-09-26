import java.util.*;;

public class P18JesseAndCookies {
    
    public static int cookies(int k, List<Integer> A) {
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(A);

        while (queue.peek() < k) {
            if (queue.size() == 1) {
                return -1;
            }

            int newCookie = queue.poll() + 2 * queue.poll();
            count++;

            queue.add(newCookie);

            if (queue.peek() >= k) {
                return count;
            }
        }

        return 0;
    }
}
