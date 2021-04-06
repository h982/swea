package SW3월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 올림픽종목투표3347 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "2\n" +
            "4 3\n" +
            "5 3 1 4\n" +
            "4 3 2\n" +
            "6 6\n" +
            "3 1 4 1 5 9\n" +
            "2 6 5 3 5 9";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1 ; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            N = Integer.parseInt(str.nextToken());
            M = Integer.parseInt(str.nextToken());

            A = new int[N];
            B = new int[M];
            str = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++){
                A[i] = Integer.parseInt(str.nextToken());
            }
            str = new StringTokenizer(input.readLine());
            for(int i = 0; i < M; i++){
                B[i] = Integer.parseInt(str.nextToken());
            }
            Arrays.sort(B);
            A_score = new int[N];
            int idx = 0;
            for(int i = M-1; i >= 0 ; i--){
                int cost = B[i];
                idx = findMax(idx, cost);
            }
            int max_value = 0;
            int max_idx = 0;
            for(int i = 0; i < N; i++){
                if(max_value < A_score[i]) {
                    max_value = A_score[i];
                    max_idx = i;
                }
            }
            output.append("#" + test_case + " " + (max_idx+1) + "\n");
        }
        System.out.println(output);
    }
    static int[] A;
    static int[] B;
    static int[] A_score;
    static int N, M;
    static int findMax(int start, int cost){

        int idx = start;
        while(idx < M){
            if(A[idx] <= cost){
                A_score[idx]++;
                return idx;
            }
            idx++;
        }
        return start;
    }
}
