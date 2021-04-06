package SW3월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ladder21211 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int T = 10;
        for(int test_case = 1; test_case <= T; test_case++){
            input.readLine();
            map = new int[100][];
            StringTokenizer str;
            for(int i = 0; i < 100; i++){
                str = new StringTokenizer(input.readLine());
                int[] temp = new int[100];
                for(int j = 0; j < 100; j++){
                    temp[j] = Integer.parseInt(str.nextToken());
                }
                map[i] = temp;
            }
            start_points = new ArrayList<>();
            for(int i = 0; i < 100; i++){
                if(map[0][i] == 1){
                    start_points.add(i);
                }
            }
            min_dist = Integer.MAX_VALUE;
            for(int i = 0; i < start_points.size(); i++){
                search(i ,start_points.get(i));
            }
            output.append("#" + test_case + " " + min_start + "\n");
        }
        System.out.println(output);
    }
    static int[][]map;
    static int min_dist, min_start;
    static int[] dr = {0, 0, 1};
    static int[] dc = {1, -1, 0};
    static List<Integer> start_points;
    static void search(int idx, int start){
        int row = 0;
        int col = start;
        int sum = 1;
        while (row < 99){
            for(int d = 0; d < 3; d++){
                int nr = row + dr[d];
                int nc = col + dc[d];
                if(isIn(nr,nc) && map[nr][nc] == 1){
                    if(d == 0){
                        col = start_points.get(++idx);
                        sum += col - nc + 2;
                        row++;
                        break;
                    }else if(d == 1){
                        col = start_points.get(--idx);
                        sum += nc - col + 2;
                        row++;
                        break;
                    }else{
                        row = nr;
                        sum++;
                        break;
                    }
                }
            }
            if(sum > min_dist)
                return;
        }
        if(sum < min_dist) {
            min_dist = sum;
            min_start = start;
        }
    }
    static boolean isIn(int row, int col){
        return row >= 0 && row < 100 && col >= 0 && col < 100;
    }
}
