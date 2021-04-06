package SW3월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 행렬찾기1258 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            N = Integer.parseInt(input.readLine());
            map = new char[N][];
            StringTokenizer str;
            for(int i = 0; i < N; i++) {
                str = new StringTokenizer(input.readLine());
                char[] temp = new char[N];
                for(int j = 0; j < N; j++){
                    temp[j] = str.nextToken().charAt(0);
                }
                map[i] = temp;
            }
            ans = new ArrayList<>();
            search();
            Collections.sort(ans, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[2] != o2[2])
                        return Integer.compare(o1[2], o2[2]);

                    return o1[0] - o2[0];
                }
            });
            output.append("#" + test_case + " " + ans.size() + " ");
            for(int[] temp : ans){
                output.append(temp[0] + " " + temp[1] + " ");
            }
            output.append("\n");
        }
        System.out.println(output);
    }
    static int N;
    static char[][] map;
    static ArrayList<int[]> ans;
    static void search(){
        int row = 0;
        int col = -1;

        while(true){
            if(++col == N){
                row++;
                col = 0;
            }
            if(!isIn(row, col))
                return;
            if(map[row][col] == '0')
                continue;
            calcMatrix(row, col);
        }
    }
    static boolean isIn(int row, int col){
        return row >= 0 && row < N && col >= 0 && col < N;
    }
    static void calcMatrix(int row, int col){
        int nr = row;
        int nc = col;
        int row_count = 0;
        int col_count = 0;
        while(isIn(nr,nc) && map[nr][nc] != '0'){
            col_count++;
            nc++;
        }
        nc = col;
        while(isIn(nr,nc) && map[nr][nc] != '0'){
            row_count++;
            nr++;
        }
        for(int i = row; i < row+row_count; i++){
            for(int j = col; j < col+col_count; j++)
                map[i][j] = '0';
        }

        ans.add(new int[]{row_count, col_count, row_count*col_count});
    }
}
