import java.util.*;

public class P10GridChallenge {
    
    public static String gridChallenge(List<String> grid) {

        List<String> rows = new ArrayList<>();

        for (String s : grid) {
            char[] array = s.toCharArray();
            Arrays.sort(array);
            rows.add(new String(array));
        }

        List<String> columns = new ArrayList<>();

        for (int i = 0; i < rows.get(0).length(); i++) {
            StringBuilder sb = new StringBuilder();
            final int pos = i;
            rows.forEach(w -> sb.append(w.charAt(pos)));
            columns.add(sb.toString());
        }

        for (int i = 0; i < columns.size(); i++) {
            if (notInOrder(columns.get(i))) {
                return "NO";
            }
        }

        return "YES";
    }

    private static boolean notInOrder(String s) {
        if (s.length() == 1) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        List<String> grid = new ArrayList<>(List.of("l"));
        System.out.println(gridChallenge(grid));
    }
}
