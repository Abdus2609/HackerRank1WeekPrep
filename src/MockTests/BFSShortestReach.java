import java.util.*;

public class BFSShortestReach {

    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
            int[][] graph = new int[n + 1][n + 1];
            int[] distances = new int[n + 1];
            boolean[] visited = new boolean[n + 1];
            Queue<Integer> queue = new LinkedList<>();
    
            for (int i = 0; i < m; i++) {
                int v = edges.get(i).get(0);
                int u = edges.get(i).get(1);
                graph[v][u] = 1;
                graph[u][v] = 1;
            }
    
            visited[s] = true;
            queue.add(s);
    
            while (!queue.isEmpty()) {
                int node = queue.remove();
    
                for (int i = 1; i < n + 1; i++) {
                    if (graph[node][i] == 1 && !visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                        distances[i] = distances[node] + 6;
                    }
                }
            }
    
            List<Integer> result = new ArrayList<>();
    
            for (int i = 1; i < n + 1; i++) {
                if (i == s) {
                    continue;
                }
    
                if (visited[i]) {
                    result.add(distances[i]);
                } else {
                    result.add(-1);
                }
            }
    
            return result;
        }

}