package SW3월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최장증가부분수열 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "2\n" +
            "5\n" +
            "1 3 2 5 4 \n" +
            "6\n" +
            "4 2 3 1 5 6";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());

            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int[] maxLenArr = new int[N];
            int ans = 1;
            for(int i = 0; i < N; i++){
                int max = 1;
                for(int j = 0; j < i; j++){
                    if(arr[j] < arr[i]){
                        max = Math.max(max, maxLenArr[j]+ 1);
                    }
                }
                maxLenArr[i] = max;
                ans = Math.max(max, ans);
            }
            output.append("#" + test_case + " " + ans + "\n");
        }
        System.out.println(output);
    }
}
