package SW4월3주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 활주로건설 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "10\n" +
            "6 2\n" +
            "3 3 3 2 1 1\n" +
            "3 3 3 2 2 1\n" +
            "3 3 3 3 3 2\n" +
            "2 2 3 2 2 2\n" +
            "2 2 3 2 2 2\n" +
            "2 2 2 2 2 2\n" +
            "6 4\n" +
            "3 2 2 2 1 2 \n" +
            "3 2 2 2 1 2 \n" +
            "3 3 3 3 2 2 \n" +
            "3 3 3 3 2 2 \n" +
            "3 2 2 2 2 2 \n" +
            "3 2 2 2 2 2 \n" +
            "7 2\n" +
            "1 1 1 1 2 1 1 \n" +
            "1 1 1 2 2 2 1 \n" +
            "2 2 2 2 2 2 2 \n" +
            "2 2 2 2 2 2 2 \n" +
            "2 2 2 2 2 2 2 \n" +
            "2 2 2 2 2 2 2 \n" +
            "2 2 2 2 2 2 2 \n" +
            "8 3\n" +
            "2 2 2 3 3 4 2 2 \n" +
            "2 2 2 3 3 4 2 2 \n" +
            "2 2 2 2 2 2 2 2 \n" +
            "2 2 2 2 2 2 2 2 \n" +
            "2 2 2 2 1 1 2 2 \n" +
            "2 1 1 1 1 1 1 1 \n" +
            "2 1 1 1 1 1 1 1 \n" +
            "2 1 1 1 1 1 1 1 \n" +
            "8 4\n" +
            "1 1 1 1 1 1 1 1 \n" +
            "1 1 1 1 1 1 1 1 \n" +
            "1 1 1 1 1 1 1 1 \n" +
            "2 1 1 1 1 1 1 1 \n" +
            "2 1 1 1 1 1 1 1 \n" +
            "2 1 1 1 1 1 1 1 \n" +
            "1 1 1 1 1 1 1 2 \n" +
            "1 1 1 1 1 1 1 2 \n" +
            "9 4\n" +
            "4 4 3 3 3 3 2 2 2 \n" +
            "4 4 3 3 1 1 2 2 3 \n" +
            "3 3 2 2 1 1 1 1 2 \n" +
            "1 1 1 1 1 1 1 1 1 \n" +
            "1 1 1 1 1 1 1 1 1 \n" +
            "2 2 1 1 1 1 1 1 1 \n" +
            "2 2 1 1 1 1 1 1 1 \n" +
            "2 2 2 2 2 2 1 1 1 \n" +
            "3 3 3 3 2 2 2 2 1 \n" +
            "10 2\n" +
            "2 2 3 5 3 1 1 1 1 1 \n" +
            "2 2 3 5 3 1 1 1 1 1 \n" +
            "3 3 4 5 4 3 2 1 1 2 \n" +
            "3 3 4 5 4 3 2 1 1 2 \n" +
            "5 5 5 5 5 5 3 1 1 3 \n" +
            "4 4 4 5 5 5 4 3 3 3 \n" +
            "4 4 4 5 5 5 5 5 5 3 \n" +
            "4 4 4 4 4 5 5 5 5 3 \n" +
            "4 4 4 4 4 5 5 5 5 3 \n" +
            "5 5 4 4 4 5 5 5 5 4 \n" +
            "12 4\n" +
            "4 4 4 5 5 4 4 4 4 4 4 4 \n" +
            "5 5 5 5 5 5 5 5 5 5 5 4 \n" +
            "4 4 4 5 5 4 4 4 5 5 5 4 \n" +
            "3 3 4 5 5 4 3 4 5 5 5 4 \n" +
            "3 3 4 5 5 4 3 4 5 5 5 4 \n" +
            "2 2 3 4 4 4 4 4 4 4 4 5 \n" +
            "2 2 3 4 4 4 4 4 4 4 4 5 \n" +
            "2 2 3 3 3 4 5 3 2 2 4 4 \n" +
            "3 3 3 4 4 4 5 4 3 3 4 4 \n" +
            "3 3 4 5 5 5 5 5 5 5 5 4 \n" +
            "3 3 4 5 5 5 5 5 5 5 5 4 \n" +
            "4 4 4 4 4 4 5 5 5 5 5 4 \n" +
            "15 3\n" +
            "5 4 4 3 3 3 2 2 2 3 4 4 4 4 4 \n" +
            "5 4 4 3 3 3 2 2 2 3 4 4 4 4 4 \n" +
            "5 5 5 5 4 4 2 2 3 4 4 4 4 4 5 \n" +
            "5 4 4 3 3 3 2 2 3 4 4 4 4 4 4 \n" +
            "5 3 3 1 2 2 3 3 3 4 4 4 4 4 4 \n" +
            "3 3 3 3 3 3 3 3 3 3 4 4 4 4 4 \n" +
            "3 3 3 3 3 3 3 3 3 3 4 4 4 4 4 \n" +
            "2 3 3 4 3 3 3 3 3 3 3 4 4 4 3 \n" +
            "2 3 3 4 3 3 3 3 3 3 3 4 4 4 3 \n" +
            "3 4 4 4 4 4 3 3 3 3 3 3 4 4 4 \n" +
            "5 5 5 4 4 4 4 4 3 3 3 3 4 4 5 \n" +
            "5 5 5 4 4 4 4 4 3 3 3 3 4 4 5 \n" +
            "5 5 5 5 4 4 4 4 3 3 2 2 3 3 4 \n" +
            "5 5 5 5 5 5 4 4 3 3 2 1 2 2 3 \n" +
            "5 5 5 5 5 5 4 4 3 3 2 1 2 2 3 \n" +
            "20 3\n" +
            "3 3 3 2 2 2 2 3 3 3 4 4 4 4 4 4 5 5 5 5 \n" +
            "3 3 3 2 2 2 2 3 3 3 4 4 4 4 4 4 5 5 5 5 \n" +
            "5 3 3 2 2 2 2 2 3 3 4 4 4 4 5 5 5 5 5 5 \n" +
            "4 3 3 1 1 1 1 1 2 3 4 4 4 5 5 5 5 5 5 5 \n" +
            "4 2 2 1 1 1 1 1 2 3 4 5 5 5 5 5 5 5 5 5 \n" +
            "4 3 3 2 2 2 2 1 2 3 4 5 5 5 5 5 5 5 5 5 \n" +
            "4 4 4 4 4 3 3 2 3 4 5 5 5 5 5 5 5 5 5 5 \n" +
            "4 3 3 3 3 3 3 3 4 4 4 5 5 5 5 5 5 4 4 4 \n" +
            "4 3 3 3 3 3 3 3 4 4 4 5 5 5 5 5 5 4 4 4 \n" +
            "4 3 3 3 3 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 \n" +
            "3 3 3 3 3 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 \n" +
            "3 3 3 3 3 4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 \n" +
            "3 3 3 3 4 4 4 4 5 5 5 5 5 5 5 5 5 5 5 5 \n" +
            "4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 4 4 4 \n" +
            "4 4 4 4 4 4 4 5 5 5 5 5 5 5 5 5 5 4 4 4 \n" +
            "5 5 5 5 5 5 5 5 5 5 5 5 4 4 4 4 4 4 4 4 \n" +
            "5 5 5 5 5 5 5 5 5 5 5 5 3 3 3 3 4 4 4 4 \n" +
            "5 5 5 5 5 5 5 5 5 5 5 5 3 3 2 2 3 3 4 4 \n" +
            "5 5 5 5 5 5 5 5 5 5 5 5 3 3 2 2 3 3 4 4 \n" +
            "5 5 5 5 5 5 5 5 4 4 4 4 3 3 3 3 4 4 4 4 \n";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            N = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            map = new int[N][];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(input.readLine());
                int[] temp = new int[N];
                for(int j = 0; j < N; j++){
                    temp[j] = Integer.parseInt(st.nextToken());
                }
                map[i] = temp;
            }

            output.append("#" + test_case +" " + calc() +"\n");
        }
        System.out.println(output);
    }
    static int N, X;
    static int[][] map;

    static int calc(){
        int ans = 0;
        for(int i = 0; i < N; i++){
            if(verticalChk(i)) {
//                System.out.println("V" + i);
                ans++;
            }
            if(horizontalChk(i)) {
//                System.out.println("C" + i);
                ans++;
            }
        }
        return ans;
    }
    static boolean verticalChk(int idx){
        int height = map[0][idx];
        int cnt = 1;
        for(int i = 1; i < N; i++){
            if(map[i][idx] == height) {
                cnt++;
                continue;
            }
            if(map[i][idx] == height-1){
                for(int j = 1; j < X; j++){
                    if(!isIn(i+j, idx) || map[i+j][idx] != height-1){
                        return false;
                    }
                }
                height = map[i][idx];
                cnt = 0;
                i += X - 1;
            }else if(map[i][idx] == height + 1){
                if(cnt < X)
                    return false;

                height = map[i][idx];
                cnt = 1;
            }else{
                return false;
            }
        }
        return true;
    }
    static boolean horizontalChk(int idx){
        int height = map[idx][0];
        int cnt = 1;
        for(int i = 1; i < N; i++){
            if(map[idx][i] == height) {
                cnt++;
                continue;
            }
            if(map[idx][i] == height-1){
                for(int j = 1; j < X; j++){
                    if(!isIn(i+j, idx) || map[idx][i+j] != height-1){
                        return false;
                    }
                }
                height = map[idx][i];
                cnt = 0;
                i += X - 1;
            }else if(map[idx][i] == height + 1){
                if(cnt < X)
                    return false;

                height = map[idx][i];
                cnt = 1;
            }else{
                return false;
            }
        }
        return true;
    }
    static boolean isIn(int r, int c){
        return r < N && c < N;
    }
}
