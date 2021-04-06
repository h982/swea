package SW2월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 범수햄버거 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "1\n" +
            "5 1000\n" +
            "100 200\n" +
            "300 500\n" +
            "250 300\n" +
            "500 1000\n" +
            "400 400";

    static int N, max_calory, max_happiness;
    static int[][] buger;
    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str;
            str = new StringTokenizer(input.readLine());
            N = Integer.parseInt(str.nextToken());
            max_calory = Integer.parseInt(str.nextToken());
            buger = new int[N][2];

            for(int i = 0; i < N; i++){
                str = new StringTokenizer(input.readLine());
                buger[i][0] = Integer.parseInt(str.nextToken());
                buger[i][1] = Integer.parseInt(str.nextToken());
            }
            max_happiness = Integer.MIN_VALUE;
            makeBuger(0, 0, 0);


            output.append("#" + test_case + " " + max_happiness + "\n");
        }
        System.out.println(output);
    }
    // 순열, 조합, 부분집합
    static void makeBuger(int cnt, int calory, int happiness) {
        if(calory > max_calory){
            return;
        }
        if(cnt == N){
            if(happiness > max_happiness)
                max_happiness = happiness;
            return;
        }
        makeBuger(cnt+1, calory + buger[cnt][1], happiness + buger[cnt][0]);

        makeBuger(cnt+1, calory, happiness);
    }
}
