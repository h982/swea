package SW3월2주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 성수의프로그래밍6719 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(input.readLine());
        for(int test_case =1 ; test_case <= T; test_case++){
            StringTokenizer str = new StringTokenizer(input.readLine());
            int N = Integer.parseInt(str.nextToken());
            int K = Integer.parseInt(str.nextToken());

            int[] course = new int[N];
            str = new StringTokenizer(input.readLine());
            for(int i = 0; i < N; i++){
                course[i] = Integer.parseInt(str.nextToken());
            }
            Arrays.sort(course);

            double sum = 0;
            for(int i = N-K; i < N; i++){
                sum /= 2;
                sum += (double)course[i]/2;
            }

            output.append("#" + test_case + " " + String.format("%.6f", sum) + "\n");
        }
        System.out.println(output);
    }
}
