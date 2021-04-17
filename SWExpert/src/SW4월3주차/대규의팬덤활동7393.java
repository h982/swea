package SW4월3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 대규의팬덤활동7393 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    static final long MOD = 1000000000;
    static long[][][] dp;
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            N = Integer.parseInt(input.readLine());
            dp = new long[N][10][1<<11];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < 10; j++)
                    Arrays.fill(dp[i][j], -1);
            }

            long r = 0;
            for(int idx = 1; idx < 10; idx++){
                r = (r + fan(idx, 0, 0)) % MOD;
            }
            output.append("#" + test_case +" " + r + '\n');
        }
        System.out.println(output);
    }
    static int N;
    // num : 현재 끝값, len : 길이, state : 포함된 숫자
    static long fan(int num, int len, int state){
        if(num < 0 || num > 9)
            return 0;

        // 마지막, N개가 골라짐
        if(len == N-1){
            if((state | (1<<num)) == (1<<10)-1){
                return 1;
            }
            return 0;
        }

        if(dp[len][num][state] != -1)
            return dp[len][num][state];

        state |= (1<<num);
        return  dp[len][num][state] = (fan(num-1, len+1, state|(1<<num))
                + fan(num+1, len+1, state|(1<<num))) % MOD;
    }
}
