package SW4월3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 벽돌깨기5656 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            N = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            map = new int[H][];
            for(int i = 0; i < H; i++){
                st = new StringTokenizer(input.readLine());
                int[] temp = new int[W];
                for(int j = 0; j < W; j++) {
                    temp[j] = Integer.parseInt(st.nextToken());
                }
                map[i] = temp;
            }
            tempMap = new int[H][W];
            min_blocks = getBlocks(map);
            balls = new int[N];
            dfs(0);

            output.append("#" + test_case + " " + min_blocks +"\n");
        }
        System.out.println(output);
    }
    static int N, W, H, min_blocks;
    static int[][] map;
    static int[] balls;
    static void dfs(int cnt){
        if(cnt == N){
            System.out.println();
            System.out.println(Arrays.toString(balls));
            for(int i = 0; i < H; i++){
                System.arraycopy(map[i],0, tempMap[i], 0, W);
            }
            dropBalls();
            return;
        }
        for(int i = 0; i < W; i++){
            balls[cnt] = i;
            dfs(cnt + 1);
        }
    }
    static int[][] tempMap;
    static void dropBalls(){
        for(int i = 0; i < N; i++){
            int col = balls[i];
            int row = 0;
            while(row < H){
                if(tempMap[row][col] != 0){
                    boom(row, col, tempMap[row][col]);
                    makeDown();
                    break;
                }
                row++;
            }
        }
        int remains = getBlocks(tempMap);
        if(balls[0] == 5 && balls[1] == 4 && balls[2] == 4){
            System.out.println();
            for(int[] m: tempMap)
                System.out.println(Arrays.toString(m));
        }

        if(remains < min_blocks) {
//            System.out.println();
//            for(int[] m: tempMap)
//                System.out.println(Arrays.toString(m));

            min_blocks = remains;
        }
    }
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {1, -1, 0, 0};
    static void boom(int row, int col, int explode){
        tempMap[row][col] = 0;
        int exp_cnt = explode - 1;
        for(int d = 0; d < 4; d++){
            int nr = row;
            int nc = col;
            for(int i = 0; i < exp_cnt; i++) {
                nr += dr[d];
                nc += dc[d];
                if(!isIn(nr, nc))
                    break;
                if(tempMap[nr][nc] != 0){
                    boom(nr, nc, tempMap[nr][nc]);
                }
            }
        }
    }
    static void makeDown(){
        for(int i = 0; i < W; i++){
            for(int j = H-1; j >= 0; j--){
                if(tempMap[j][i] == 0){
                    for(int k = j; k >= 0; k--){
                        if(tempMap[k][i] != 0){
                            tempMap[j][i] = tempMap[k][i];
                            tempMap[k][i] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }
    static int getBlocks(int[][] m){
        int cnt = 0;
        for(int i = 0; i < W; i++){
            int temp = 0;
            while(temp < H){
                if(m[temp][i] != 0){
                    cnt += H - temp;
                    break;
                }
                temp++;
            }
        }
        return cnt;
    }
    static boolean isIn(int r, int c){
        return r >= 0 && r < H && c >= 0 && c < W;
    }
}
