package SW4월4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 벌꿀채취2115 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            map = new int[N][];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(input.readLine());
                int[] temp = new int[N];
                for(int j = 0; j < N; j++)
                    temp[j] = Integer.parseInt(st.nextToken());
                map[i] = temp;
            }
            ans = 0;
            select(0, 0, 0, 0);
            output.append("#" + test_case + " " + ans + "\n");
        }
        System.out.println(output);
    }
    static int N, M, C;
    static int[][] map;
    static int ans;
    static void select(int r, int c, int idx, int profit){
        if(idx == 2){
            if(profit > ans)
                ans = profit;
            return;
        }

        while(r < N){
            if(c + M - 1 >= N){
                r++;
                c = 0;
                continue;
            }
            max_profit = 0;
            calcHoney(r, c, 0, 0, 0);
            select(r, c+C, idx+1, profit + max_profit);
            c++;
        }
    }
    static int max_profit;
    static void calcHoney(int r, int c, int idx, int honey, int profit){
        if(idx == M){
            if(max_profit < profit)
                max_profit = profit;
            return;
        }else if(honey == C){
            if(max_profit < profit)
                max_profit = profit;
            return;
        }

        if(honey + map[r][c] <= C)
            calcHoney(r, c+1, idx+1, honey + map[r][c], profit + map[r][c]*map[r][c]);
        calcHoney(r, c+1, idx+1, honey, profit);
    }
}
