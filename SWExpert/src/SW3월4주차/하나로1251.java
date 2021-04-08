package SW3월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 하나로1251 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "4\n" +
            "2\n" +
            "0 0\n" +
            "0 100\n" +
            "1.0\n" +
            "4\n" +
            "0 0 400 400\n" +
            "0 100 0 100\n" +
            "1.0\n" +
            "6\n" +
            "0 0 400 400 1000 2000\n" +
            "0 100 0 100 600 2000\n" +
            "0.3\n" +
            "9\n" +
            "567 5 45674 24 797 29 0 0 0\n" +
            "345352 5464 145346 54764 5875 0 3453 4545 123\n" +
            "0.0005";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());
            land = new int[N][2];
            StringTokenizer st = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++){
                land[i][0] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++){
                land[i][1] = Integer.parseInt(st.nextToken());
            }

//            List<island> islands = new ArrayList<>();
//            for(int i = 0; i < N; i++){
//                for(int j = 0; j < N; j++) {
//                    if(i != j)
//                        islands.add(new island(i, j, calcDist(i, j)));
//                }
//            }
//            Collections.sort(islands);

            Double E = Double.parseDouble(input.readLine());

        }

    }
    static List<island> islands;
    static int[][] land;

    static long calcDist(int i1, int i2){
        long x_dist = land[i1][0] - land[i2][0];
        long y_dist = land[i1][1] - land[i2][1];

        return x_dist*x_dist + y_dist*y_dist;
    }

    static class island implements Comparable<island>{
        int from;
        int to;
        long edge;

        public island(int from, int to, long edge){
            this.edge = edge;
            this.from = from;
            this.to = to;
        }

        @Override
        public int compareTo(island o) {
            return (int)(this.edge - o.edge);
        }
    }
}
