package SW4월3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 신도시전기연결하기6855 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] houses = new int[N];
            st = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++)
                houses[i] = Integer.parseInt(st.nextToken());

            int[] len = new int[N-1];
            for(int i = 0; i < N-1; i++){
                len[i] = houses[i+1] - houses[i];
            }
            Arrays.sort(len);
            int sum = 0;
            for(int i = 0; i < N-K; i++){
                sum += len[i];
            }
            output.append("#" + test_case + " " + sum +"\n");
        }
        System.out.println(output);
    }
}
