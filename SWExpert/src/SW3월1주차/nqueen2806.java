package SW3월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class nqueen2806 {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "2\n" +
            "1\n" +
            "2";


    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(input.readLine());
            queens = new ArrayList<>();
            count = 0;
            makeQueen(0);
            output.append("#" + test_case + " " + count + "\n");
        }
        System.out.println(output);
    }

    static int N, count;
    static List<int[]> queens;

    static void makeQueen(int idx) {
        if (idx == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (isPossible(idx, i)) {
                queens.add(new int[]{idx, i});
                makeQueen(idx + 1);
                queens.remove(idx);
            }
        }
    }

    static boolean isPossible(int x, int y) {
        for (int i = 0; i < queens.size(); i++) {
            int[] loc = queens.get(i);
            if (loc[0] == x || loc[1] == y || Math.abs(loc[0] - x) == Math.abs(loc[1] - y)) {
                return false;
            }
        }
        return true;
    }
}
//    static boolean[][] map;
//    static void countN(int cnt){
//        if(cnt == N){
//            count++;
//            return;
//        }
//
//        for(int i = 0; i < N; i++){
//            if(!map[cnt][i]){
//                map[cnt][i] = true;
//                createQ(cnt, i);
//                countN(cnt+1);
//                deleteQ(cnt, i);
//            }
//        }
//    }
//
//    static boolean isIn(int row, int col){
//        return row >= 0 && row < N && col >= 0 && col < N;
//    }
//
//    static int[] dr = {1, 1};
//    static int[] dc = {-1, 1};
//    static void createQ(int row, int col){
//        for(int i = 0; i < N; i++){
//            map[i][col] = true;
//        }
//        for(int d = 0; d < 2; d++){
//            int nr = row + dr[d];
//            int nc = col + dc[d];
//            while(isIn(nr, nc)){
//                map[nr][nc] = true;
//                nr += dr[d];
//                nc += dc[d];
//            }
//        }
//    }
//    static void deleteQ(int row, int col){
//        for(int i = 0; i < N; i++){
//            map[i][col] = false;
//        }
//        for(int d = 0; d < 2; d++){
//            int nr = row + dr[d];
//            int nc = col + dc[d];
//            while(isIn(nr, nc)){
//                map[nr][nc] = false;
//                nr += dr[d];
//                nc += dc[d];
//            }
//        }
//    }
//}
