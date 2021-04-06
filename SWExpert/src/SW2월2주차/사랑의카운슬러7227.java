package SW2월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 사랑의카운슬러7227 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();


    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(input.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(input.readLine());
            worms = new int[N][];
            StringTokenizer str;
            for(int i = 0; i < N; i++){
                str = new StringTokenizer(input.readLine());
                int[] worm = new int[2];
                worm[0] = Integer.parseInt(str.nextToken());
                worm[1] = Integer.parseInt(str.nextToken());
                worms[i] = worm;
            }
            min_distance = Long.MAX_VALUE;
            selected = new int[N/2];
            calculateDist(0, 0);
            output.append("#" + test_case + " " + min_distance + "\n");
        }
        System.out.println(output);
    }
    static int[][] worms;
    static int N;
    static long min_distance;
    static int[] selected;
    static void calculateDist(int cnt, int idx){
        if(cnt == N/2){
            long sum_x = 0, sum_y = 0;
            Arrays.sort(selected);
            for(int i = 0,j=0; i < N; i++){
                if(j < N/2 && selected[j] == i){
                    j++;
                    sum_x += worms[i][0];
                    sum_y += worms[i][1];
                }
                else{
                    sum_x -= worms[i][0];
                    sum_y -= worms[i][1];
                }
            }
            long dist = sum_x * sum_x + sum_y * sum_y;
            if(dist < min_distance)
                min_distance = dist;
            return;
        }

        for(int i = idx; i < N; i++){
            selected[cnt] = i;
            calculateDist(cnt+1, i+1);
        }

    }
}

