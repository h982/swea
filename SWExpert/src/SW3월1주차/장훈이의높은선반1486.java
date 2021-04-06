package SW3월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 장훈이의높은선반1486 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "1\n" +
            "5 16\n" +
            "1 3 3 5 6";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            N = Integer.parseInt(str.nextToken());
            S = Integer.parseInt(str.nextToken());

            h = new int[N];
            str = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++){
                h[i] = Integer.parseInt(str.nextToken());
            }
            min_height = Integer.MAX_VALUE;
            cal(0, 0);
            output.append("#" + test_case + " " + (min_height-S) + "\n");
        }
        System.out.println(output);
    }
    static int N, S;
    static int[] h;
    static int min_height;
    static void cal(int idx, int sum){
        if(sum >= S){
            if(sum < min_height)
                min_height = sum;
            return;
        }else if(idx == N){
            return;
        }

        cal(idx+1, sum + h[idx]);
        cal(idx+1, sum);
    }
}
