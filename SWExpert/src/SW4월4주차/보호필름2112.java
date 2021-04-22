package SW4월4주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 보호필름2112 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer st = new StringTokenizer(input.readLine());

            D = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            glass = new char[D][];
            tempGlass = new char[D][W];
            for(int i = 0; i < D; i++) {
                st = new StringTokenizer(input.readLine());
                char[] temp = new char[W];
                for(int j = 0; j < W; j++){
                    temp[j] = st.nextToken().charAt(0);
                }
                glass[i] = temp;
            }
            selected = new boolean[D];
            liquidType = new char[D];
            int ans = 0;

            if(K==1 || dfs(0,0,0)){
                output.append("#" + test_case + " " + ans + "\n");
                continue;
            }

            for(int i = 1; i <= D; i++){
                if(dfs(0, 0, i)){
                    ans = i;
                    break;
                }
            }
            output.append("#" + test_case + " " + ans + "\n");
        }
        System.out.println(output);
    }

    static int D, W, K;
    static char[][] glass;
    static char[][] tempGlass;
    static boolean[] selected;
    static char[] liquidType;
    static boolean dfs(int idx, int cnt, int end){
        if(cnt == end){
            for(int i = 0; i < D; i++)
                System.arraycopy(glass[i], 0, tempGlass[i],0, W);
            for(int i = 0; i < D; i++){
                if(selected[i]){
                    changeRow(i, liquidType[i]);
                }
            }
            if(check()) {
                return true;
            }
            return false;
        }
        for(int i = idx; i < D; i++){
            selected[i] = true;
            liquidType[i] = '1';
            if(dfs(i+1, cnt+1, end))
                return true;
            liquidType[i] = '0';
            if(dfs(i+1, cnt+1, end))
                return true;
            selected[i] = false;
        }
        return false;
    }


    static void changeRow(int idx, char liquid){
        for(int i = 0; i < W; i++)
            tempGlass[idx][i] = liquid;
    }
    static boolean check(){
        for(int i = 0; i < W; i++){
            boolean isOk = false;
            char now = tempGlass[0][i];
            int cnt = 1;
            for(int j = 1; j < D; j++){
                if(now == tempGlass[j][i]){
                    if(++cnt == K) {
                        isOk = true;
                        break;
                    }
                }else {
                    now = tempGlass[j][i];
                    cnt = 1;
                }
            }
            if(!isOk)
                return false;
        }
        return true;
    }
}
