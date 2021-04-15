package SW4월3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 탈주범검거1953 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            map = new int[N][];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(input.readLine());
                int[] temp = new int[M];
                for(int j = 0; j < M; j++){
                    temp[j] = Integer.parseInt(st.nextToken());
                }
                map[i] = temp;
            }
            output.append("#" + test_case + " " + bfs() +"\n");
        }
        System.out.println(output);
    }
    static int N,M,R,C,L;
    static int[][] map;
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};
    static String[]pipe ={
            null,
            "0312",
            "03",
            "12",
            "02",
            "32",
            "31",
            "01"
    };
    static int bfs(){
        int result = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        queue.offer(new int[]{R,C});
        visited[R][C] = true;
        int time = 1;
        ++result;
        while(time++ < L){
            int size = queue.size();
            while(size --> 0){
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];
                String info = pipe[map[r][c]];

                for(int d = 0, len = info.length(); d < len; d++){
                    int dir = info.charAt(d) - '0';
                    int nr = r + dr[dir];
                    int nc = c + dc[dir];
                    if(nr >= 0 && nr < N && nc >= 0 && nc < M
                            && map[nr][nc] > 0
                            && pipe[map[nr][nc]].contains(Integer.toString(3-dir))
                            && !visited[nr][nc]){
                        visited[nr][nc] = true;
                        queue.add(new int[]{nr,nc});
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
