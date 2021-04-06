package SW2월3주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 알덴테스파게티8457 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src =
            "2\n" +
            "2 10 0\n" +
            "1 5\n" +
            "3 10 5\n" +
            "16 100 10000";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(str.nextToken());
            int B = Integer.parseInt(str.nextToken());
            int E = Integer.parseInt(str.nextToken());

            str = new StringTokenizer(input.readLine());
            int time, min_time = B - E, max_time = B + E;
            int count = 0;
            for(int i = 0; i < N; i ++){
                time = Integer.parseInt(str.nextToken());
                int times = time;
                while (times < min_time){
                    times += time;
                }
                if(times >= min_time && times <= max_time)
                    count++;
            }
            output.append("#" + test_case + " " + count + "\n");
        }
        System.out.println(output);
    }
}
