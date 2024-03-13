import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class SubwayRoutes {

    static class Edge {
        int destination;
        int color;

        Edge(int destination, int color) {
            this.destination = destination;
            this.color = color;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] nm = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(nm[0]); Removed
            int m = Integer.parseInt(nm[1]);

            Map<Integer, List<Edge>> graph = new HashMap<>();
            for (int i = 0; i < m; i++) {
                String[] edgeInfo = br.readLine().trim().split(" ");
                int u = Integer.parseInt(edgeInfo[0]);
                int v = Integer.parseInt(edgeInfo[1]);
                int c = Integer.parseInt(edgeInfo[2]);

                graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new Edge(v, c));
                graph.computeIfAbsent(v, k -> new ArrayList<>()).add(new Edge(u, c));
            }

            String[] stations = br.readLine().trim().split(" ");
            int b = Integer.parseInt(stations[0]);
            int e = Integer.parseInt(stations[1]);

            int minSubwayLines = findMinSubwayLines(graph, b, e);
            System.out.println(minSubwayLines);
        }
    }

    private static int findMinSubwayLines(Map<Integer, List<Edge>> graph, int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size() + 1];
        int[] colors = new int[graph.size() + 1];
        Arrays.fill(colors, -1); // -1 indicates no color encountered yet

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int currentStation = queue.poll();

            for (Edge neighbor : graph.getOrDefault(currentStation, Collections.emptyList())) {
                if (!visited[neighbor.destination]) {
                    visited[neighbor.destination] = true;
                    queue.offer(neighbor.destination);
                    if (colors[currentStation]!= neighbor.color) {
                        colors[neighbor.destination] = neighbor.color;
                    }
                }
            }
        }

        // Count the number of different colors encountered
        int minSubwayLines = 0;
        for (int i = 1; i <= graph.size(); i++) {
            if (colors[i]!= -1 && colors[i]!= colors[start]) {
                minSubwayLines++;
            }
        }

        return minSubwayLines;
    }
}