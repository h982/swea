package SW3월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 러시아국기같은깃발4613 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "3\n" +
            "4 5\n" +
            "WRWRW\n" +
            "BWRWB\n" +
            "WRWRW\n" +
            "RWBWR\n" +
            "6 14\n" +
            "WWWWWWWWWWWWWW\n" +
            "WWRRWWBBBBBBWW\n" +
            "WRRRWWWBWWWWRB\n" +
            "WWBWBWWWBWRRRR\n" +
            "WBWBBWWWBBWRRW\n" +
            "WWWWWWWWWWWWWW\n" +
            "6 14\n" +
            "WWWWWWWWWWWWWW\n" +
            "BBBBBBBBBBBBBB\n" +
            "BBBBBBBBBBBBBB\n" +
            "WWBBBBBBBBBBBB\n" +
            "WBWBBWWWBBWRRW\n" +
            "WWWWWWWWWWWWWW";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer str = new StringTokenizer(input.readLine());
            N = Integer.parseInt(str.nextToken());
            M = Integer.parseInt(str.nextToken());

            char[][] flag = new char[N][];
            for(int i = 0 ; i < N; i++){
                flag[i] = input.readLine().toCharArray();
            }

            flag_color = new int[N][3];
            for(int i = 0; i < N; i++){
                int white = 0;
                int red = 0;
                int blue = 0;
                for(int j = 0; j < M; j++){
                    if(flag[i][j] == 'W'){
                        white++;
                    }else if(flag[i][j] == 'B'){
                        blue++;
                    }else {
                        red++;
                flag_color[i][2] = red;
               }
            min_change = Integer.MAX_VALUE;
            dfs(0, 'W', 0);
            output.append("#" + test_case + " " + min_change + "\n");
                }
            } 
        }
        System.out.println(output);
    }
    static int[][] flag_color;
    static int N, M;
    static int min_change;
    static void dfs(int idx, char color, int sum){
        if(min_change < sum)
            return;
        if(color == 'W'){
            for(int i = idx; i < N-2; i++){
                sum += M - flag_color[i][0];
                dfs(i+1, 'B', sum);
            }
        }else if(color == 'B'){
            for(int i = idx; i < N-1; i++){
                sum += M - flag_color[i][1];
                dfs(i+1, 'R', sum);
            }
        }else if(color == 'R'){
            for(int i = idx; i < N; i++){
                sum += M - flag_color[i][2];
            }
            if(min_change > sum){
                min_change = sum;
                return;
            }
        }
    }
}
