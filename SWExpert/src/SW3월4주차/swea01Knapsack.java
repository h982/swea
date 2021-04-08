package SW3월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea01Knapsack {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "1\n" +
            "4 5\n" +
            "1 2\n" +
            "3 2\n" +
            "4 4\n" +
            "2 3";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] V = new int[N+1];
            int[] C = new int[N+1];
            int[][] bags = new int[N+1][K+1];
            for(int i = 1; i <= N; i++){
                st = new StringTokenizer(input.readLine());
                V[i] = Integer.parseInt(st.nextToken());
                C[i] = Integer.parseInt(st.nextToken());
            }

            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= K; j++){
                    if(j < V[i]) {
                        bags[i][j] = bags[i-1][j];
                        continue;
                    }
                    bags[i][j] = Math.max(bags[i-1][j], bags[i-1][j-V[i]] + C[i]);
                }
            }
            output.append("#" + test_case + " " + bags[N][K] + "\n");
        }
        System.out.println(output);
    }
}
