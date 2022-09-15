import java.util.List;

public class P4LonelyInteger {
    
    public static int lonelyInteger(List<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            final int pos = i;
            if (a.stream().filter(n -> n == a.get(pos)).count() == 1) {
                return a.get(i);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 3, 2, 1);
        System.out.println(lonelyInteger(list));
    }
}
