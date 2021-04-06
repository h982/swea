package SW2월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 달리기5987 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "3\n" +
            "3 2\n" +
            "1 2\n" +
            "1 3\n" +
            "5 5\n" +
            "1 2\n" +
            "2 5\n" +
            "1 3\n" +
            "3 4\n" +
            "4 5\n" +
            "16 1\n" +
            "5 9";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            N = Integer.parseInt(str.nextToken());
            M = Integer.parseInt(str.nextToken());

            record = new int[M][];
            for(int i = 0; i < M; i++){
                str = new StringTokenizer(input.readLine());
                int[] temp = new int[2];
                temp[0] = Integer.parseInt(str.nextToken());
                temp[1] = Integer.parseInt(str.nextToken());
                record[i] = temp;
            }
            answer = new int[N];
            used = new boolean[N+1];
            count = 0;
            findCount(0);
            output.append("#" + test_case + " " + count + "\n");
        }
        System.out.println(output);
    }
    static int N, M;
    static int[][] record;
    static int[] answer;
    static boolean[] used;
    static long count;
    static void findCount(int idx){
        if(idx == N){
            if(!check())
                return;
            count++;
            return;
        }else if(!check()){
            return;
        }
        for(int i = 1; i <= N; i++){
            if(!used[i]){
                used[i] = true;
                answer[idx] = i;
                findCount(idx+1);
                used[i] = false;
            }
        }
    }
    static boolean check(){
        int[] checking;
        for(int i = 0; i < M; i++){
            checking = record[i];
            if(used[checking[0]] && used[checking[1]]){
                int x=0,y=0;
                for(int j = 0; j < N; j++){
                    if(answer[j] == checking[0])
                        x = j;
                    else if(answer[j] == checking[1])
                        y = j;
                }
                if(x > y)
                    return false;
            }
        }
        return true;
    }
}
