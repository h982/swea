package SW2월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class 미로1226 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();


    public static void main(String[] args) throws IOException {
        int T = 10;

        for(int test_case = 1; test_case <= T; test_case++){
            input.readLine();
            map = new char[N][];
            for(int i = 0; i < N; i++){
                map[i] = input.readLine().toCharArray();
            }
            boolean isOk = isValid(1,1);
            output.append("#" + test_case + " " + (isOk?1:0) + "\n");
        }
        System.out.println(output);
    }

    static int N = 16;
    static char[][] map;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static boolean isValid(int row, int col){
        if(map[row][col] == '3'){
            return true;
        }

        map[row][col] = '1';
        for(int d = 0; d < 4; d++){
            int nr = row + dr[d];
            int nc = col + dc[d];
            if(!isIn(nr,nc) || map[nr][nc] == '1')
                continue;

            if(isValid(nr,nc))
                return true;
        }

        return false;
    }

    static boolean isIn(int row, int col){
        return (row >= 0 && row < N && col >= 0 && col < N);
    }
}
