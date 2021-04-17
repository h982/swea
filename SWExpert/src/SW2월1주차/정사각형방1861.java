package SW2월1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;
 
public class 정사각형방1861 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
   
    static int[][] rooms;
    static int N;
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            N = Integer.parseInt(input.readLine());
            rooms = new int[N][N];
            for(int i = 0; i < N; i++){
                StringTokenizer str = new StringTokenizer(input.readLine());
                for(int j = 0; j <N; j++)
                    rooms[i][j] = Integer.parseInt(str.nextToken());
            }
            max_count = 0;
            room_num = 0;
            visited = new boolean[N][N];
            for(int i = 0; i < N; i++)
                for(int j = 0; j < N; j++) {
                    start_row = i;
                    start_col = j;
                    roomCheck(start_row, start_col, 1);
                }
            output.append("#" + test_case + " " + room_num + " " + max_count + "\n");
        }
        System.out.println(output);
    }
    static int max_count;
    static int room_num;
    static boolean[][] visited;
    static int[]dr = {-1,1,0,0};
    static int[]dc = {0,0,-1,1};
    static int start_row;
    static int start_col;
    private static void roomCheck(int row, int col, int room_count){
        if(room_count > max_count){
            room_num = rooms[start_row][start_col];
            max_count = room_count;
        }else if(room_count == max_count){
            if(rooms[start_row][start_col] < room_num)
                room_num = rooms[start_row][start_col];
        }
 
        visited[row][col] = true;
        for(int i = 0; i < 4; i++){
            int d_row = row + dr[i];
            int d_col = col + dc[i];
            if(d_row >=0 && d_row < N && d_col >= 0 && d_col < N){
                if(!visited[d_row][d_col])
                    if((rooms[row][col]+1) == rooms[d_row][d_col]){
                        roomCheck(d_row, d_col, room_count+1);
                    }
            }
        }
        visited[row][col] = false;
    }
 
}
