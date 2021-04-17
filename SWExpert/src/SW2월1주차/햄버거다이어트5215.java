package SW2월1주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 햄버거다이어트5215 {
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
    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));
        int T = Integer.parseInt(input.readLine());

        for(int test_case = 1; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(str.nextToken());
            int max_calory = Integer.parseInt(str.nextToken());
            int[] calories = new int[N];
            int[] happiness = new int[N];
            for(int i = 0; i < N; i++){
                str = new StringTokenizer(input.readLine());
                happiness[i] = Integer.parseInt(str.nextToken());
                calories[i] = Integer.parseInt(str.nextToken());
            }
            int max_happiness = 0;
            for(int i = 1; i < Math.pow(2, N); i++){
                int now_calory = 0;
                int now_happy = 0;
                for(int j = 0; j < N; j++){
                    if((i>>j & 1) == 1){
                        now_calory += calories[j];
                        now_happy += happiness[j];
                    }
                }
                if(now_calory <= max_calory)
                    if(now_happy > max_happiness)
                        max_happiness = now_happy;

            }
            output.append("#" + test_case + " " + max_happiness);
        }
        System.out.println(output);
    }
}
