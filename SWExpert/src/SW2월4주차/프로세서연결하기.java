package SW2월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 프로세서연결하기 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "3\n" +
            "7\n" +
            "0 0 1 0 0 0 0\n" +
            "0 0 1 0 0 0 0\n" +
            "0 0 0 0 0 1 0\n" +
            "0 0 0 0 0 0 0\n" +
            "1 1 0 1 0 0 0\n" +
            "0 1 0 0 0 0 0\n" +
            "0 0 0 0 0 0 0\n" +
            "9\n" +
            "0 0 0 0 0 0 0 0 0\n" +
            "0 0 1 0 0 0 0 0 1\n" +
            "1 0 0 0 0 0 0 0 0\n" +
            "0 0 0 1 0 0 0 0 0\n" +
            "0 1 0 0 0 0 0 0 0\n" +
            "0 0 0 0 0 0 1 0 0\n" +
            "0 0 0 1 0 0 0 0 0\n" +
            "0 0 0 0 0 0 0 1 0\n" +
            "0 0 0 0 0 0 0 0 1\n" +
            "11\n" +
            "0 0 1 0 0 0 0 0 0 0 0\n" +
            "0 0 0 0 0 0 0 0 0 0 0\n" +
            "0 0 0 0 0 0 0 0 0 0 1\n" +
            "0 0 0 1 0 0 0 0 1 0 0\n" +
            "0 1 0 1 1 0 0 0 1 0 0\n" +
            "0 0 0 0 0 0 0 0 0 0 0\n" +
            "0 0 0 0 0 0 0 1 0 0 0\n" +
            "0 0 0 0 0 0 0 0 0 0 0\n" +
            "0 0 0 0 0 0 0 0 1 0 0\n" +
            "0 0 0 0 0 0 1 0 0 0 0\n" +
            "0 0 0 0 0 0 0 0 0 0 0";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            N = Integer.parseInt(input.readLine());
            map = new int[N][N];
            StringTokenizer str;
            for(int i = 0; i < N; i++) {
                str = new StringTokenizer(input.readLine());
                for(int j = 0; j < N; j++)
                    map[i][j] = Integer.parseInt(str.nextToken());
            }
            max_connect = Integer.MIN_VALUE;
            min_line = Integer.MAX_VALUE;
            makeLine(0, 0, 0, 0);

            System.out.println("#" + test_case + " " + min_line );
        }
        System.out.println(output);
    }
    static int[][] map;
    static int[] dr = {1,-1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static int N, max_connect, min_line;
    static void makeLine(int row, int col, int connect, int line){
        int r = row;
        int c = col;
        while(true){
            if(c == N){
                c = 0;
                r++;
            }
            if(r == N || map[r][c] == 1)
                break;
            c++;
        }

        if(r == N) {
            if(connect > max_connect) {
                max_connect = connect;
                min_line = line;
            }else if(connect == max_connect){
                min_line = Math.min(min_line, line);
            }
            return;
        }

        if(r == 0 || r == N-1 || c == 0 || c == N-1){
            makeLine(r, c+1, connect+1, line);
            return;
        }

        for(int d = 0; d < 4; d++){
            int ret;
            if((ret = checkLine(r, c, d, 0)) > 0){
                makeLine(r, c+1, connect+1, line+ret);
                removeLine(r, c, d);
            }
        }
        makeLine(r, c+1, connect, line);
    }

    static int checkLine(int row, int col, int d, int line){
        int nr = row + dr[d];
        int nc = col + dc[d];
        if(!isIn(nr, nc))
            return line;
        if(map[nr][nc] == 0){
            map[nr][nc] = 2;
            int ret;
            if((ret = checkLine(nr, nc, d, line+1)) > 0){
                return ret;
            }
            map[nr][nc] = 0;
            return -1;
        }
        return -1;
    }

    static void removeLine(int row, int col, int d){
        int nr = row + dr[d];
        int nc = col + dc[d];
        while(isIn(nr,nc)){
            map[nr][nc] = 0;
            nr = nr + dr[d];
            nc = nc + dc[d];
        }
    }

    static boolean isIn(int row, int col){
        return (row >= 0 && row < N && col >= 0 && col < N);
    }
}
