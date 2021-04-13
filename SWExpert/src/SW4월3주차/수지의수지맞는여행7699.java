package SW4월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수지의수지맞는여행7699 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            map = new char[R][];
            for(int i = 0; i < R; i++)
                map[i] = input.readLine().toCharArray();
            alpha = new boolean['Z'-'A' + 1];
            max_dist = 0;
            flag = false;
            alpha[map[0][0] - 'A'] = true;
            dfs(0,0, 1);
            output.append("#" + test_case + " " + max_dist + "\n");
        }
        System.out.println(output);
    }
    static int R, C;
    static char[][] map;
    static boolean[] alpha;
    static int max_dist;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static boolean flag;
    static void dfs(int r, int c, int sum){

        for(int d = 0; d < 4; d++){
            int nr = r + dr[d];
            int nc = c + dc[d];
            if(isIn(nr,nc) && !alpha[map[nr][nc]-'A']){
                alpha[map[nr][nc]-'A'] = true;
                dfs(nr, nc, sum+1);
                alpha[map[nr][nc]-'A'] = false;
            }
            if(flag)
                return;
        }

        if(sum > max_dist) {
            if(sum == 26)
                flag = true;
            max_dist = sum;
        }
    }
    static boolean isIn(int r, int c){
        return r >= 0 && r < R && c >= 0 && c < C;
    }
}
