package SW2월4주차;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class 보물왕태혁7829 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder output = new StringBuilder();
    static String src = "3\n" +
            "4\n" +
            "2 3 4 6\n" +
            "3\n" +
            "27 3 9\n" +
            "1\n" +
            "13";

    public static void main(String[] args) throws IOException {
        input = new BufferedReader(new StringReader(src));

        int T = Integer.parseInt(input.readLine());
        for(int test_case = 1; test_case <= T; test_case++){
            int N = Integer.parseInt(input.readLine());

            StringTokenizer str = new StringTokenizer(input.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < N; i++){
                int temp = Integer.parseInt(str.nextToken());
                if(temp < min)
                    min = temp;
                if(temp > max)
                    max = temp;
            }
            output.append("#" + test_case + " " + (min*max) + "\n");
        }
        System.out.println(output);
    }
}
