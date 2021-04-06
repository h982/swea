package SW2월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class 미로1227 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int T = 10;
        for(int test_case = 1; test_case <= T; test_case++){
            input.readLine();
            map = new char[100][];
            for(int i = 0; i < 100; i++)
                map[i] = input.readLine().toCharArray();
            boolean isOk = findEnd(1,1);
            output.append("#" + test_case + " " + (isOk? 1 : 0) + "\n");
        }
        System.out.println(output);
    }
    static char[][] map;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static boolean findEnd(int row, int col){
        if(map[row][col] == '3'){
            return true;
        }

        map[row][col] = '1';
        for(int i = 0; i < 4; i++){
            int nr = row + dr[i];
            int nc = col + dc[i];
            if(nr < 0 || nr >= 100 || nc < 0 || nc >= 100)
                continue;
            if(map[nr][nc] != '1'){
                if(findEnd(nr, nc))
                    return true;
            }
        }
        return false;
    }
}
